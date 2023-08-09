package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.tesoreria.dto.SocioDto;
import uy.com.sportapp.tesoreria.model.SocioModel;

import java.util.ArrayList;
import java.util.Optional;


public class SocioMapper {
    public static SocioDto socioToSocioDto(SocioModel socioModel){
        SocioDto socioDto = new SocioDto();
        BeanUtils.copyProperties(socioModel, socioDto);
        return socioDto;
    }

    public static SocioModel socioDtoToSocio(SocioDto socioDto){
        SocioModel socioModel = new SocioModel();
        BeanUtils.copyProperties(socioDto, socioModel);
        return socioModel;
    }

    public static SocioDto socioOptToSocioDto(Optional<SocioModel> optionalSocio){
        SocioDto socioDto = new SocioDto();
        BeanUtils.copyProperties(optionalSocio, socioDto);
        return socioDto;
    }

    public static ArrayList<SocioDto> lstSocioModelToSocioDto(ArrayList<SocioModel> lstSocioModel) {
        ArrayList<SocioDto> lista = new ArrayList<SocioDto>();
        BeanUtils.copyProperties(lstSocioModel, lista);
        return lista;
    }
}
