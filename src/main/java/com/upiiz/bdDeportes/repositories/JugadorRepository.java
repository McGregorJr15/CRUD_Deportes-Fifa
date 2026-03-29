package com.upiiz.bdDeportes.repositories;

import com.upiiz.bdDeportes.entities.JugadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository<JugadorEntity, Long> { }