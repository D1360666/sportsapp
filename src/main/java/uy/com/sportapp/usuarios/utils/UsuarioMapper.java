package uy.com.sportapp.usuarios.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.model.UsuarioModel;

import java.util.Optional;

public class UsuarioMapper {

    public static UsuarioDto usuarioToUsuarioDto(UsuarioModel usuarioModel){
        UsuarioDto usuarioDto = new UsuarioDto();
        BeanUtils.copyProperties(usuarioModel, usuarioDto);
        return usuarioDto;
    }

    public static UsuarioModel usuarioDtoToUsuario(UsuarioDto usuarioDto){
        UsuarioModel usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioDto, usuarioModel);
        return usuarioModel;
    }

    public static UsuarioDto usuarioOptToUsuarioDto(Optional<UsuarioModel> optionalUsuario){
        UsuarioDto usuarioDto = new UsuarioDto();
        BeanUtils.copyProperties(optionalUsuario, usuarioDto);
        return usuarioDto;
    }
}
