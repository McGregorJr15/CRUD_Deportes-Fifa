package com.upiiz.bdDeportes.controllers;

import com.upiiz.bdDeportes.entities.EntrenadorEntity;
import com.upiiz.bdDeportes.services.EntrenadorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/entrenadores")
public class EntrenadorController {

    private final EntrenadorService entrenadorService;

    public EntrenadorController(EntrenadorService entrenadorService) {
        this.entrenadorService = entrenadorService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("entrenadores", entrenadorService.obtenerTodos());
        return "Listado-Entrenadores"; // Asegúrate de tener este HTML
    }

    @GetMapping("/agregar")
    public String mostrarFormularioAgregar(Model model) {
        model.addAttribute("entrenador", new EntrenadorEntity());
        return "Agregar-Entrenador"; 
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute EntrenadorEntity entrenador) {
        entrenadorService.guardar(entrenador);
        return "redirect:/entrenadores";
    }

    @GetMapping("/actualizar/{id}")
    public String mostrarFormularioActualizar(@PathVariable Long id, Model model) {
        EntrenadorEntity entrenador = entrenadorService.obtenerPorId(id);
        if (entrenador == null) return "redirect:/entrenadores";
        model.addAttribute("entrenador", entrenador);
        return "Actualizar-Entrenador";
    }

    @GetMapping("/eliminar/{id}")
    public String mostrarFormularioEliminar(@PathVariable Long id, Model model) {
        EntrenadorEntity entrenador = entrenadorService.obtenerPorId(id);
        if (entrenador == null) return "redirect:/entrenadores";
        model.addAttribute("entrenador", entrenador);
        return "Eliminar-Entrenador";
    }

    @PostMapping("/borrar/{id}")
    public String borrar(@PathVariable Long id) {
        entrenadorService.eliminar(id);
        return "redirect:/entrenadores";
    }
}
