package uy.com.sportapp.usuarios.service.interfaces;

import org.springframework.data.jpa.repository.Query;
import uy.com.sportapp.usuarios.dto.UsuarioDto;

import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDto> findAll();
    public UsuarioDto login(String usuario, String password);
    public UsuarioDto findById(Integer id);
    public UsuarioDto saveUsuario(UsuarioDto usuarioDto);
    public UsuarioDto updateUsuario(UsuarioDto usuarioDto);

}
