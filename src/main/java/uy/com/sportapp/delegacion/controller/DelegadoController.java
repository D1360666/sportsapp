package uy.com.sportapp.delegacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.delegacion.dto.DelegadoDto;
import uy.com.sportapp.delegacion.service.interfaces.iDelegadoService;
import java.util.List;
@RestController
@RequestMapping("/sportapi/delegado")
public class DelegadoController {
    @Autowired
    private iDelegadoService iService;
    @GetMapping
    public ResponseEntity<List<DelegadoDto>> getDelegados(){return ResponseEntity.ok().body(iService.findAll());}
    @GetMapping("/{id}")
    public ResponseEntity<DelegadoDto>delegadoPorId(@PathVariable Integer id){
        return ResponseEntity.ok().body(iService.findById(id));
    }
    @PostMapping
    public ResponseEntity<DelegadoDto> saveDelegado(@RequestBody DelegadoDto delegadoDto){
        return ResponseEntity.ok().body(iService.saveDelegado(delegadoDto));
    }
    @PutMapping
    public ResponseEntity<DelegadoDto> updateDelegado(@RequestBody DelegadoDto delegadoDto){
        return ResponseEntity.ok().body(iService.updateDelegado(delegadoDto));
    }
}
