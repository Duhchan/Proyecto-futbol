package com.example.futbol.demo.controller;

import com.example.futbol.demo.model.Estadio;
import com.example.futbol.demo.repositorio.EstadioInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/estadios")
public class EstadioController {

    private final EstadioInterface estadioInterface;

    public EstadioController(EstadioInterface estadioInterface) {
        this.estadioInterface = estadioInterface;
    }

    @GetMapping("listarEstadios")
    public ResponseEntity<?> listarEstadios() {
        return ResponseEntity.ok(estadioInterface.findAll());
    }

    @PostMapping("addEstadio")
    public ResponseEntity<?> addEstadio(@RequestBody Estadio nuevoEstadio) {
        Estadio estadioSave = estadioInterface.save(nuevoEstadio);
        return ResponseEntity.status(HttpStatus.CREATED).body(estadioSave);
    }
}