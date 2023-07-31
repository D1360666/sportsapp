package uy.com.sportapp.delegacion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.delegacion.dto.DelegadoDto;
import uy.com.sportapp.delegacion.model.DelegadoModel;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.model.UsuarioModel;

import java.util.Optional;

public class DelegadoMapper {
    public static DelegadoDto delegadoToDelegadoDto(DelegadoModel delegadoModel){
        DelegadoDto delegadoDto = new DelegadoDto();
        BeanUtils.copyProperties(delegadoModel, delegadoDto);
        return delegadoDto;
    }

    public static DelegadoModel delegadoDtoToDelegado(DelegadoDto delegadoDto){
        DelegadoModel delegadoModel = new DelegadoModel();
        BeanUtils.copyProperties(delegadoDto, delegadoModel);
        return delegadoModel;
    }

    public static DelegadoDto delegadoOptToDelegadoDto(Optional<DelegadoModel> optionalDelegado){
        DelegadoDto delegadoDto = new DelegadoDto();
        BeanUtils.copyProperties(optionalDelegado, delegadoDto);
        return delegadoDto;
    }

}
