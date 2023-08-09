package uy.com.sportapp.tesoreria.service.interfaces;

import uy.com.sportapp.tesoreria.dto.SocioDto;
import uy.com.sportapp.tesoreria.dto.TesoreriaDto;

import java.util.List;

public interface iTesoreriaService {
    TesoreriaDto saveTesoreria(TesoreriaDto tesoreriaDto);
    TesoreriaDto updateTesoreria(TesoreriaDto tesoreriaDto);
    TesoreriaDto findById(Integer id);
    List<TesoreriaDto> findAll();
}
