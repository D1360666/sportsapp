package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.institucion.model.JugadorModel;

import java.util.ArrayList;
import java.util.Optional;

public class InstitucionMapper {

    public static InstitucionDto institucionToInstitucionDto(InstitucionModel institucionModel){
        InstitucionDto  institucionDto = new InstitucionDto();
        BeanUtils.copyProperties(institucionModel, institucionDto);
        return institucionDto;
    }

    public static InstitucionModel institucionDtoToInstitucion(InstitucionDto institucionDto){
        InstitucionModel institucionModel = new InstitucionModel();
        BeanUtils.copyProperties(institucionDto, institucionModel);
        return institucionModel;
    }


    public static InstitucionDto institucionOptToInstitucionDto(Optional<InstitucionModel> optionalInstitucion){
        InstitucionDto institucionDto = new InstitucionDto();
        BeanUtils.copyProperties(optionalInstitucion, institucionDto);
        return institucionDto;
    }

    public static ArrayList<InstitucionDto> lstInstucionModelToInstitucionDto(ArrayList<InstitucionModel> lstInstitucionModel) {
        ArrayList<InstitucionDto> lista = new ArrayList<InstitucionDto>();
        BeanUtils.copyProperties(lstInstitucionModel, lista);
        return lista;
    }
}
