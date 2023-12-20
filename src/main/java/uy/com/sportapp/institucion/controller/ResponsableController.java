package uy.com.sportapp.institucion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.dto.ResponsableDto;
import uy.com.sportapp.institucion.service.interfaces.iJugadorService;
import uy.com.sportapp.institucion.service.interfaces.iResponsableService;

import java.util.List;

@RestController
@RequestMapping("/sportapi/responsable")
public class ResponsableController {
    @Autowired
    private iResponsableService iService;
    @GetMapping
    public ResponseEntity<List<ResponsableDto>> getResponsables(){return ResponseEntity.ok().body(iService.findAll());}
    @GetMapping("/{id}")
    public ResponseEntity<ResponsableDto>responsablePorId(@PathVariable Integer id){
        return ResponseEntity.ok().body(iService.findById(id));
    }
    @PostMapping
    public ResponseEntity<ResponsableDto> saveResponsable(@RequestBody ResponsableDto responsableDto){
        return ResponseEntity.ok().body(iService.saveResponsable(responsableDto));
    }
    @PutMapping
    public ResponseEntity<ResponsableDto> updateResponsable(@RequestBody ResponsableDto responsableDto){
        return ResponseEntity.ok().body(iService.updateResponsable(responsableDto));
    }
}