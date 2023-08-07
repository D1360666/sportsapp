package uy.com.sportapp.institucion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.service.interfaces.iInstitucionService;

import java.util.List;

@RestController
@RequestMapping("/institucion")
public class InstitucionController {
    @Autowired
    private iInstitucionService iService;

    @GetMapping
    public ResponseEntity<List<InstitucionDto>> getInstituciones(){return ResponseEntity.ok().body(iService.findAll());}
    @GetMapping("/{id}")
    public ResponseEntity<InstitucionDto>institicionPorId(@PathVariable Integer id){
        return ResponseEntity.ok().body(iService.findById(id));
    }
    @PostMapping
    public ResponseEntity<InstitucionDto> saveInstitucion(@RequestBody InstitucionDto institucionDto){
        return ResponseEntity.ok().body(iService.saveInstitucion(institucionDto));
    }
}
