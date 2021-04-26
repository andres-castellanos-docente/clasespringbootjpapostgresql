package com.prueba.demo.servicesimpl;

import com.prueba.demo.entities.PersonasEntity;
import com.prueba.demo.repositories.PersonasRepository;
import com.prueba.demo.services.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonasServicesImpl implements PersonasServices {

    @Autowired
    private PersonasRepository personasRepository;

    @Override
    public List<PersonasEntity> getPasajeros() {
          return  personasRepository.findAll();
    }

    @Override
    public List<PersonasEntity> getPasajerosPorApellido(String apellido) {
        return  personasRepository.findAllByPrimerapellido(apellido);
    }


}
