package com.upiiz.bdDeportes.services;

import com.upiiz.bdDeportes.entities.EntrenadorEntity;
import com.upiiz.bdDeportes.repositories.EntrenadorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EntrenadorServiceImpl implements EntrenadorService {
    private final EntrenadorRepository repo;
    public EntrenadorServiceImpl(EntrenadorRepository repo) { this.repo = repo; }

    @Override public List<EntrenadorEntity> obtenerTodos() { return repo.findAll(); }
    @Override public EntrenadorEntity obtenerPorId(Long id) { return repo.findById(id).orElse(null); }
    @Override public void guardar(EntrenadorEntity entrenador) { repo.save(entrenador); }
    @Override public void eliminar(Long id) { repo.deleteById(id); }
}
