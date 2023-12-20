package uy.com.sportapp.institucion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.institucion.dto.CargoDto;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.service.interfaces.iJugadorService;

import java.util.List;

@RestController
@RequestMapping("/sportapi/jugador")
public class JugadorController {
    @Autowired
    private iJugadorService iService;
    @GetMapping
    public ResponseEntity<List<JugadorDto>> getJugadores(){return ResponseEntity.ok().body(iService.findAll());}
    @GetMapping("/{id}")
    public ResponseEntity<JugadorDto>jugadorPorId(@PathVariable Integer id){
        return ResponseEntity.ok().body(iService.findById(id));
    }
    @PostMapping
    public ResponseEntity<JugadorDto> saveJugador(@RequestBody JugadorDto jugadorDto){
        return ResponseEntity.ok().body(iService.saveJugador(jugadorDto));
    }
}
