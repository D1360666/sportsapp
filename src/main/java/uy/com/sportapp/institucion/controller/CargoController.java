package uy.com.sportapp.institucion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.institucion.dto.CargoDto;
import uy.com.sportapp.institucion.service.interfaces.iCargoService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    private iCargoService iService;

    @GetMapping
    public ResponseEntity<List<CargoDto>> getCargos(){
        return ResponseEntity.ok().body(iService.findAll());
    }

    @PostMapping
    public ResponseEntity<CargoDto> saveCargo(@RequestBody CargoDto cargoDto){
        return ResponseEntity.ok().body(iService.saveCargo(cargoDto));
    }

}
