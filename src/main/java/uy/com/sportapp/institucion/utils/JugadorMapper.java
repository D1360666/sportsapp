package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.institucion.model.JugadorModel;

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
}
