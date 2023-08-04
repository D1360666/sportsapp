package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.institucion.model.JugadorModel;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.model.UsuarioModel;

import java.util.Optional;

public class JugadorMapper {
    public static JugadorDto jugadorToJugadorDto(JugadorModel jugadorModel){
        JugadorDto  jugadorDto = new JugadorDto();
        BeanUtils.copyProperties(jugadorModel, jugadorDto);
        return jugadorDto;
    }

    public static JugadorModel jugadorDtoToJugador(JugadorDto jugadorDto){
        JugadorModel jugadorModel = new JugadorModel();
        BeanUtils.copyProperties(jugadorDto, jugadorModel);
        return jugadorModel;
    }

    public static JugadorDto jugadorOptToJugadorDto(Optional<JugadorModel> optionalJugador){
        JugadorDto jugadorDto = new JugadorDto();
        BeanUtils.copyProperties(optionalJugador, jugadorDto);
        return jugadorDto;
    }
}
