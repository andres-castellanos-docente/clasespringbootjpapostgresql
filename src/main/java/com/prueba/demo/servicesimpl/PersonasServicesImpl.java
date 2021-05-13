package com.prueba.demo.servicesimpl;

import com.prueba.demo.entities.PersonasEntity;
import com.prueba.demo.repositories.PersonasRepository;
import com.prueba.demo.services.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonasServicesImpl implements PersonasServices {

    @Autowired
    private PersonasRepository personasRepository;

    @Override
    public List<PersonasEntity> getPersonas() {
          return  personasRepository.findAll();
    }

    @Override
    public List<PersonasEntity> getPersonasPorApellido(String apellido) {
        return  personasRepository.findAllByPrimerapellidoContains(apellido);
    }

    //@Transactional
    @Override
    public PersonasEntity crearEdPersonas(PersonasEntity persona) {
        try {
            PersonasEntity personaSaved = personasRepository.save(persona);
            return personaSaved;

        }
        catch (Exception e) {
            return null;
        }
    }

    @Override
    public Integer elimPersona(Long idpersona) {
        try {
            personasRepository.deleteById(idpersona);
            return 1;

        } catch (Exception e) {
            return -1;
        }
    }


}
