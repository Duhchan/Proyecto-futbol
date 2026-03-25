package com.example.futbol.demo.controller;


import com.example.futbol.demo.model.Equipo;
import com.example.futbol.demo.model.Jugador;
import com.example.futbol.demo.repositorio.EquipoInterface;
import com.example.futbol.demo.repositorio.JugadorInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/jugador")
public class JugadorController {

    private final JugadorInterface jugadorInterface;
    private final EquipoInterface equipoInterface;

    public JugadorController(JugadorInterface jugadorInterface, EquipoInterface equipoInterface) {
        this.jugadorInterface = jugadorInterface;
        this.equipoInterface = equipoInterface;
    }
    @GetMapping("listarJugador")
    public ResponseEntity<?>listarJugador(){
    return ResponseEntity.ok(jugadorInterface.findAll());
    }
    @PostMapping("agregarJugador")
    public ResponseEntity<?>agregarJugador(@RequestBody Jugador nuevoJugador){
        nuevoJugador.setEquipo(equipoInterface.getReferenceById(nuevoJugador.getID_equipo()));
        nuevoJugador.setEquipo(equipo);
        Jugador guardarJugador = jugadorInterface.save(nuevoJugador);
        return ResponseEntity.status(HttpStatus.CREATED).body(guardarJugador);
    }

}

