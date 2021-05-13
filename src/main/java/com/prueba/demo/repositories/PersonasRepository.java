package com.prueba.demo.repositories;

import com.prueba.demo.entities.PersonasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonasRepository extends JpaRepository<PersonasEntity, Long> {
    List<PersonasEntity> findAllByPrimerapellidoContains(String apellido);
}
