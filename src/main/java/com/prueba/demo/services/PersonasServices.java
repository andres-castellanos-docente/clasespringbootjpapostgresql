package com.prueba.demo.services;

import com.prueba.demo.entities.PersonasEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PersonasServices {
    public List<PersonasEntity> getPersonas();
    public List<PersonasEntity> getPersonasPorApellido(String apellido);
    public PersonasEntity crearEdPersonas(PersonasEntity persona);
    public Integer elimPersona(Long idpersona);
}
