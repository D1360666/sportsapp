package uy.com.sportapp.delegacion.service.interfaces;

import uy.com.sportapp.delegacion.dto.DelegadoDto;
import java.util.List;

public interface iDelegadoService {
    DelegadoDto saveDelegado(DelegadoDto delegadoDto);
    DelegadoDto updateDelegado(DelegadoDto delegadoDto);
    DelegadoDto findById(Integer id);
    List<DelegadoDto> findAll();
}
