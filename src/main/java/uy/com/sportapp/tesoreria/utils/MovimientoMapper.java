package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.tesoreria.dto.MovimientoDto;
import uy.com.sportapp.tesoreria.model.MovimientoModel;

import java.util.ArrayList;
import java.util.Optional;


public class MovimientoMapper {
    public static MovimientoDto movimientoToMovimientoDto(MovimientoModel movimientoModel){
        MovimientoDto movimientoDto = new MovimientoDto();
        BeanUtils.copyProperties(movimientoModel, movimientoDto);
        return movimientoDto;
    }

    public static MovimientoModel movimientoDtoToMovimiento(MovimientoDto movimientoDto){
        MovimientoModel movimientoModel = new MovimientoModel();
        BeanUtils.copyProperties(movimientoDto, movimientoModel);
        return movimientoModel;
    }

    public static MovimientoDto movimientoOptToMovimientoDto(Optional<MovimientoModel> optionalMovimiento){
        MovimientoDto movimientoDto = new MovimientoDto();
        BeanUtils.copyProperties(optionalMovimiento, movimientoDto);
        return movimientoDto;
    }

    public static ArrayList<MovimientoDto> lstMovimientoModelToMovimientoDto(ArrayList<MovimientoModel> lstMovimientoModel) {
        ArrayList<MovimientoDto> lista = new ArrayList<MovimientoDto>();
        BeanUtils.copyProperties(lstMovimientoModel, lista);
        return lista;
    }
}
