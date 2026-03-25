package com.example.futbol.demo.repositorio;

import com.example.futbol.demo.model.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadioInterface extends JpaRepository<Estadio, Integer> {
}
