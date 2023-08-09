package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.MovimientoDto;
import uy.com.sportapp.tesoreria.dto.SocioDto;

import java.util.List;

public interface iSocioService {
    SocioDto saveSocio(SocioDto socioDto);
    SocioDto updateSocio(SocioDto socioDto);
    SocioDto findById(Integer id);
    List<SocioDto> findAll();
}
