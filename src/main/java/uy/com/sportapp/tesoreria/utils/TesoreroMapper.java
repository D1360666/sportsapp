package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.tesoreria.dto.TesoreroDto;
import uy.com.sportapp.tesoreria.model.TesoreroModel;

import java.util.ArrayList;
import java.util.Optional;

public class TesoreroMapper {
    public static TesoreroDto tesoreroToTesoreroDto(TesoreroModel tesoreroModel){
        TesoreroDto tesoreroDto = new TesoreroDto();
        BeanUtils.copyProperties(tesoreroModel, tesoreroDto);
        return tesoreroDto;
    }

    public static TesoreroModel tesoreroDtoToTesorero(TesoreroDto tesoreroDto){
        TesoreroModel tesoreroModel = new TesoreroModel();
        BeanUtils.copyProperties(tesoreroDto, tesoreroModel);
        return tesoreroModel;
    }

    public static TesoreroDto tesoreroOptToTesoreroDto(Optional<TesoreroModel> optionalTesorero){
        TesoreroDto tesoreroDto = new TesoreroDto();
        BeanUtils.copyProperties(optionalTesorero, tesoreroDto);
        return tesoreroDto;
    }

    public static ArrayList<TesoreroDto> lstTesoreroModelToTesoreroDto(ArrayList<TesoreroModel> lstTesoreroModel) {
        ArrayList<TesoreroDto> lista = new ArrayList<TesoreroDto>();
        BeanUtils.copyProperties(lstTesoreroModel, lista);
        return lista;
    }
}
