package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.tesoreria.dto.GastoDto;
import uy.com.sportapp.tesoreria.model.GastoModel;

import java.util.ArrayList;
import java.util.Optional;


public class GastoMapper {
    public static GastoDto gastoToGastoDto(GastoModel gastoModel){
        GastoDto gastoDto = new GastoDto();
        BeanUtils.copyProperties(gastoModel, gastoDto);
        return gastoDto;
    }

    public static GastoModel gastoDtoToGasto(GastoDto gastoDto){
        GastoModel gastoModel = new GastoModel();
        BeanUtils.copyProperties(gastoDto, gastoModel);
        return gastoModel;
    }

    public static GastoDto gastoOptToGastoDto(Optional<GastoModel> optionalGasto){
        GastoDto gastoDto = new GastoDto();
        BeanUtils.copyProperties(optionalGasto, gastoDto);
        return gastoDto;
    }

    public static ArrayList<GastoDto> lstGastoModelToGastoDto(ArrayList<GastoModel> lstGastoModel) {
        ArrayList<GastoDto> lista = new ArrayList<GastoDto>();
        BeanUtils.copyProperties(lstGastoModel, lista);
        return lista;
    }
}
