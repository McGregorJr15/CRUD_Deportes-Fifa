package com.upiiz.bdDeportes.services;

import com.upiiz.bdDeportes.entities.JugadorEntity;
import java.util.List;

public interface JugadorService {
    
    List<JugadorEntity> obtenerTodos();
    JugadorEntity obtenerPorId(Long id);
    void guardar(JugadorEntity jugador);
    void eliminar(Long id);
}