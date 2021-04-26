package com.prueba.demo.services;

import com.prueba.demo.entities.PersonasEntity;

import java.util.List;

public interface PersonasServices {
    public List<PersonasEntity> getPasajeros();
    public List<PersonasEntity> getPasajerosPorApellido(String apellido);
}
