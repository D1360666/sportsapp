package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.model.InstitucionModel;

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


}
