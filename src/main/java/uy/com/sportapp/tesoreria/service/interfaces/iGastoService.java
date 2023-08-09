package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.GastoDto;
import uy.com.sportapp.tesoreria.dto.MovimientoDto;

import java.util.List;

public interface iGastoService {
    GastoDto saveGasto(GastoDto gastoDto);
    //GastoDto updateGasto(GastoDto gastoDto);
    GastoDto findById(Integer id);
    List<GastoDto> findAll();
}
