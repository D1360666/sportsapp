package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.tesoreria.dto.TesoreriaDto;
import uy.com.sportapp.tesoreria.model.TesoreriaModel;

import java.util.ArrayList;
import java.util.Optional;

public class TesoreriaMapper {
    public static TesoreriaDto tesoreriaToTesoreriaDto(TesoreriaModel tesoreriaModel){
        TesoreriaDto tesoreriaDto = new TesoreriaDto();
        BeanUtils.copyProperties(tesoreriaModel, tesoreriaDto);
        return tesoreriaDto;
    }

    public static TesoreriaModel tesoreriaDtoToTesoreria(TesoreriaDto tesoreriaDto){
        TesoreriaModel tesoreriaModel = new TesoreriaModel();
        BeanUtils.copyProperties(tesoreriaDto, tesoreriaModel);
        return tesoreriaModel;
    }

    public static TesoreriaDto tesoreriaOptToTesoreriaDto(Optional<TesoreriaModel> optionalTesoreria){
        TesoreriaDto tesoreriaDto = new TesoreriaDto();
        BeanUtils.copyProperties(optionalTesoreria, tesoreriaDto);
        return tesoreriaDto;
    }

    public static ArrayList<TesoreriaDto> lstTesoreriaModelToTesoreriaDto(ArrayList<TesoreriaModel> lstTesoreriaModel) {
        ArrayList<TesoreriaDto> lista = new ArrayList<TesoreriaDto>();
        BeanUtils.copyProperties(lstTesoreriaModel, lista);
        return lista;
    }
}
