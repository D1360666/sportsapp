package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.SocioDto;
import uy.com.sportapp.tesoreria.dto.TesoreroDto;

import java.util.List;

public interface iTesoreroService {
    TesoreroDto saveTesorero(TesoreroDto tesoreroDto);
    TesoreroDto updateTesorero(TesoreroDto tesoreroDto);
    TesoreroDto findById(Integer id);
    List<TesoreroDto> findAll();
}
