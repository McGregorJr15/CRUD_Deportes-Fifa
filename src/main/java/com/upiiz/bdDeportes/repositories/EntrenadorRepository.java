package com.upiiz.bdDeportes.repositories;

import com.upiiz.bdDeportes.entities.EntrenadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<EntrenadorEntity, Long> { }