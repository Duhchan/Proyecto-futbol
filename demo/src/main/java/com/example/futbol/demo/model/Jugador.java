package com.example.futbol.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name ="jugador")

public class Jugador {
    @Id
    private Integer id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_equipo", nullable = false)
    private Equipo equipo;

    @JoinColumn(nullable = false)
    private String nombre;


    public Jugador(Integer id, String nombre, Equipo equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
    }
    public Jugador(Integer id, String nombre, Integer id_equipo) {
        this.id = id;
        this.nombre = nombre;
        setID_equipo(id_equipo);

    }
    @JsonProperty("id_equipo")
    public Integer getId_equipo(){
        return equipo == null ? null : equipo.getId();
    }
    @JsonProperty("id_equipo")
    public void setID_equipo(Integer idEquipo){
        this.equipo = (idEquipo == null)? null : new Equipo (idEquipo, null);
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


}
