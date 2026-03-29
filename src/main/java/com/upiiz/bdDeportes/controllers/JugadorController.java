package com.upiiz.bdDeportes.controllers;

import com.upiiz.bdDeportes.entities.JugadorEntity;
import com.upiiz.bdDeportes.services.JugadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/jugadores")
public class JugadorController {
    private final JugadorService service;
    public JugadorController(JugadorService service) { this.service = service; }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("jugadores", service.obtenerTodos());
        return "Listado-Jugadores"; 
    }

    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("jugador", new JugadorEntity());
        return "Agregar-Jugador"; 
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute JugadorEntity jugador) {
        service.guardar(jugador);
        return "redirect:/jugadores";
    }

    @GetMapping("/actualizar/{id}")
    public String mostrarFormularioActualizar(@PathVariable Long id, Model model) {
        JugadorEntity jugador = service.obtenerPorId(id);
        if (jugador == null) return "redirect:/jugadores";
        model.addAttribute("jugador", jugador);
        return "Actualizar-Jugador";
    }

    @GetMapping("/eliminar/{id}")
    public String mostrarFormularioEliminar(@PathVariable Long id, Model model) {
        JugadorEntity jugador = service.obtenerPorId(id);
        if (jugador == null) return "redirect:/jugadores";
        model.addAttribute("jugador", jugador);
        return "Eliminar-Jugador";
    }

    @PostMapping("/borrar/{id}")
    public String borrar(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/jugadores";
    }
}