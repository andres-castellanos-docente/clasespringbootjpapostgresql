package com.prueba.demo.controllers;

import com.prueba.demo.entities.PersonasEntity;
import com.prueba.demo.services.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class PersonasController {

    @Autowired
    private PersonasServices personasServices;



    @GetMapping("/personas")
    public List<PersonasEntity> getPersonas() {
        return personasServices.getPasajeros();
    }

    @GetMapping("/personasporapellido/{apellido}")
    public List<PersonasEntity> getPersonasApellido(@PathVariable(value = "apellido") String apellido) {
        return personasServices.getPasajerosPorApellido(apellido);
    }

}
