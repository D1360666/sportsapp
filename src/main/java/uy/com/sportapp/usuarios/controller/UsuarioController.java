package uy.com.sportapp.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uy.com.sportapp.delegacion.dto.DelegadoDto;
import uy.com.sportapp.delegacion.service.interfaces.iDelegadoService;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.service.interfaces.IUsuarioService;

import java.util.List;

@RestController
@RequestMapping("/sportapi/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService iService;
    @GetMapping
    public ResponseEntity<List<UsuarioDto>> getUsuarios(){return ResponseEntity.ok().body(iService.findAll());}
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDto>usuarioPorId(@PathVariable Integer id){
        return ResponseEntity.ok().body(iService.findById(id));
    }
    @PostMapping
    public ResponseEntity<UsuarioDto> saveUsuario(@RequestBody UsuarioDto usuarioDto){
        return ResponseEntity.ok().body(iService.saveUsuario(usuarioDto));
    }
    @PutMapping
    public ResponseEntity<UsuarioDto> updateUsuario(@RequestBody UsuarioDto usuarioDto){
        return ResponseEntity.ok().body(iService.updateUsuario(usuarioDto));
    }

}
