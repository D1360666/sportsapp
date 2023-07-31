package uy.com.sportapp.usuarios.service.interfaces;

import org.springframework.data.jpa.repository.Query;
import uy.com.sportapp.usuarios.dto.UsuarioDto;

import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDto> buscarUsuarios();

    public UsuarioDto login(String usuario, String password);
    public UsuarioDto buscarUsuarioPorId(Integer id);
    public UsuarioDto guardarUsuario(UsuarioDto usuarioDto);

}
