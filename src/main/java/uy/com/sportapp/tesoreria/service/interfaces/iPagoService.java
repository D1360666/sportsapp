package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.MovimientoDto;
import uy.com.sportapp.tesoreria.dto.PagoDto;
import uy.com.sportapp.tesoreria.model.PagoModel;

import java.util.List;

public interface iPagoService {
    PagoDto savePago(PagoDto pagoDto);
   // PagoDto updatePago(PagoDto pagoDto);
    PagoDto findById(Integer id);
    List<PagoDto> findAll();
}
