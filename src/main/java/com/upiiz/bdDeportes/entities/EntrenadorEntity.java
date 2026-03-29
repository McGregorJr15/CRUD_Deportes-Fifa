package com.upiiz.bdDeportes.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "entrenadores")
public class EntrenadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nombre;
    

    public EntrenadorEntity() {
    }

    public EntrenadorEntity(Long id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
