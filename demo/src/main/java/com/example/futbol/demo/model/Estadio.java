package com.example.futbol.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "estadio")
public class Estadio {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String nombreEstadio;

    @Column(nullable = false)
    private String capacidad;


    public Estadio() {}

    public Estadio(Integer id) {
        this.id = id;
    }

    public Estadio(Integer id, String nombreEstadio, String capacidad) {
        this.id = id;
        this.nombreEstadio = nombreEstadio;
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
}
