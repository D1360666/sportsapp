package uy.com.sportapp.delegacion.service.interfaces;

import uy.com.sportapp.delegacion.dto.DelegadoDto;
import uy.com.sportapp.institucion.dto.ResponsableDto;

import java.util.ArrayList;

public interface iDelegadoService {
    DelegadoDto saveDelegado(DelegadoDto delegadoDto);
    DelegadoDto updateDelegado(DelegadoDto delegadoDto);
    DelegadoDto findById(Integer id);
    ArrayList<DelegadoDto> findAll();
}
