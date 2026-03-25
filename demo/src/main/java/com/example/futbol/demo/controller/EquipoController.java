package com.example.futbol.demo.controller;

import com.example.futbol.demo.model.Equipo;
import com.example.futbol.demo.repositorio.EquipoInterface;
import com.example.futbol.demo.repositorio.EstadioInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/equipos")
public class EquipoController {

    public final EquipoInterface equipoInterface;

    public final EstadioInterface estadioInterface;

    public EquipoController(EquipoInterface equipoInterface, EstadioInterface estadioInterface) {
        this.equipoInterface = equipoInterface;
        this.estadioInterface = estadioInterface;
    }

    @GetMapping("listarEquipos")
    public ResponseEntity<?> listarEquipo() {
        return ResponseEntity.ok(equipoInterface.findAll()); // Se agregó el ;
    }

    @PostMapping("addEquipo")
    public ResponseEntity<?> addEquipo(@RequestBody Equipo nuevoEquipo) {
        nuevoEquipo.setEstadio(estadioInterface.getReferenceById(nuevoEquipo.getID_estadio()));

        Equipo equipoSave = equipoInterface.save(nuevoEquipo);

        return ResponseEntity.status(HttpStatus.CREATED).body(equipoSave);
    }
}