package com.example.futbol.demo.repositorio;

import com.example.futbol.demo.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorInterface  extends JpaRepository<Jugador, Integer> {
}
