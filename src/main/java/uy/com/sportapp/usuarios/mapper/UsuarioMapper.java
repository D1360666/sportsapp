package uy.com.sportapp.usuarios.mapper;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.model.Usuario;

import java.util.Optional;

public class UsuarioMapper {

    public static UsuarioDto usuarioToUsuarioDto(Usuario usuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        BeanUtils.copyProperties(usuario, usuarioDto);
        return usuarioDto;
    }

    public static Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto){
        Usuario usuario = new Usuario();
        BeanUtils.copyProperties(usuarioDto, usuario);
        return usuario;
    }

    public static UsuarioDto usuarioOptToUsuarioDto(Optional<Usuario> optionalUsuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        BeanUtils.copyProperties(optionalUsuario, usuarioDto);
        return usuarioDto;
    }
}
