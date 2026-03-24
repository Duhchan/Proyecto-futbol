package com.example.futbol.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="jugador")

public class Jugador {
    @Id
    private Integer id;

    private String nombre;

    private Equipo equipo;

    private Estadio estadio;

    public Jugador(Integer id, String nombre, Equipo equipo, Estadio estadio) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadio = estadio;
    }
    public Jugador (){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
