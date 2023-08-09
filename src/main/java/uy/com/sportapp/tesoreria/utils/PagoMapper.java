package uy.com.sportapp.tesoreria.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.tesoreria.dto.PagoDto;
import uy.com.sportapp.tesoreria.model.PagoModel;

import java.util.ArrayList;
import java.util.Optional;


public class PagoMapper {
    public static PagoDto pagoToPagoDto(PagoModel pagoModel){
        PagoDto pagoDto = new PagoDto();
        BeanUtils.copyProperties(pagoModel, pagoDto);
        return pagoDto;
    }

    public static PagoModel pagoDtoToPago(PagoDto pagoDto){
        PagoModel pagoModel = new PagoModel();
        BeanUtils.copyProperties(pagoDto, pagoModel);
        return pagoModel;
    }

    public static PagoDto pagoOptToPagoDto(Optional<PagoModel> optionalPago){
        PagoDto pagoDto = new PagoDto();
        BeanUtils.copyProperties(optionalPago, pagoDto);
        return pagoDto;
    }

    public static ArrayList<PagoDto> lstPagoModelToPagoDto(ArrayList<PagoModel> lstPagoModel) {
        ArrayList<PagoDto> lista = new ArrayList<PagoDto>();
        BeanUtils.copyProperties(lstPagoModel, lista);
        return lista;
    }
}
