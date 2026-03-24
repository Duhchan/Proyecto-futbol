package com.example.futbol.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo {

     @Id
     private Integer id;

     private String nombreEquipo;

     private Estadio estadio;

    public Equipo(Integer id, String nombreEquipo, Estadio estadio) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
    }

    public Equipo(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }
}
