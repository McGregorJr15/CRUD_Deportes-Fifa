package com.upiiz.bdDeportes.services;

import com.upiiz.bdDeportes.entities.EntrenadorEntity;
import java.util.List;

public interface EntrenadorService {
    List<EntrenadorEntity> obtenerTodos();
    EntrenadorEntity obtenerPorId(Long id);
    void guardar(EntrenadorEntity entrenador);
    void eliminar(Long id);
}