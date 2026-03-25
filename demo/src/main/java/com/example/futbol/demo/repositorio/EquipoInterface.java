package com.example.futbol.demo.repositorio;

import com.example.futbol.demo.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoInterface extends JpaRepository <Equipo, Integer> {
}
