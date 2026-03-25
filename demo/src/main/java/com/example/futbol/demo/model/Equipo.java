package com.example.futbol.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "equipo")
public class Equipo {

    @Id
    private Integer id;

    @Column(nullable = false)
    private String nombreEquipo;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estadio", nullable = false)
    private Estadio estadio;


    public Equipo() {}

    public Equipo(Integer id) {
        this.id = id;
    }

    public Equipo(Integer id, String nombreEquipo, Estadio estadio) {
        this.id = id;
        this.nombreEquipo = nombreEquipo;
        this.estadio = estadio;
    }


    @JsonProperty("id_estadio")
    public Integer getID_estadio() {
        return estadio == null ? null : estadio.getId();
    }

    @JsonProperty("id_estadio")
    public void setID_estadio(Integer idEstadio) {
        this.estadio = (idEstadio == null) ? null : new Estadio(idEstadio);
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