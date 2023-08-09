package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.MovimientoDto;

import java.util.List;

public interface iMovimientoService {
    MovimientoDto saveMovimiento(MovimientoDto movimientoDto);
    MovimientoDto updateMovimiento(MovimientoDto movimientoDto);
    MovimientoDto findById(Integer id);
    List<MovimientoDto> findAll();

}
