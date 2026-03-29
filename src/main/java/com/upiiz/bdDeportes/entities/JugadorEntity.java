package com.upiiz.bdDeportes.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "jugadores")
public class JugadorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String posicion;

    private int dorsal;

    public JugadorEntity() {
    }

    public JugadorEntity(Long id, String nombre, String posicion, int dorsal) {
        this.id = id;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }



    
}
