package com.prueba.demo.controllers;

import com.prueba.demo.entities.PersonasEntity;
import com.prueba.demo.services.PersonasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/servicios")
public class PersonasController {

    @Autowired
    private PersonasServices personasServices;


    @CrossOrigin(origins = "*")
    @GetMapping("/personas")
    public List<PersonasEntity> getPersonas() {
        return personasServices.getPersonas();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/personasporapellido/{apellido}")
    public List<PersonasEntity> getPersonasApellido(@PathVariable(value = "apellido") String apellido) {
        return personasServices.getPersonasPorApellido(apellido);
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/personas")
    public PersonasEntity addPersona(@RequestBody PersonasEntity pers) {
        return personasServices.crearEdPersonas(pers);
    }

    @CrossOrigin(origins = "*")
    @PutMapping("/personas")
    public PersonasEntity editPersona(@RequestBody PersonasEntity pers) {
        return personasServices.crearEdPersonas(pers);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/personas/{id}")
    public Integer elimPersona(@PathVariable(value = "id") Long IdPers) {
        return personasServices.elimPersona(IdPers);
    }




}
