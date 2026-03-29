package com.upiiz.bdDeportes.services;

import com.upiiz.bdDeportes.entities.JugadorEntity;
import com.upiiz.bdDeportes.repositories.JugadorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JugadorServiceImpl implements JugadorService {
    private final JugadorRepository repo;
    public JugadorServiceImpl(JugadorRepository repo) { this.repo = repo; }

    @Override public List<JugadorEntity> obtenerTodos() { return repo.findAll(); }
    @Override public JugadorEntity obtenerPorId(Long id) { return repo.findById(id).orElse(null); }
    @Override public void guardar(JugadorEntity jugador) { repo.save(jugador); }
    @Override public void eliminar(Long id) { repo.deleteById(id); }
}