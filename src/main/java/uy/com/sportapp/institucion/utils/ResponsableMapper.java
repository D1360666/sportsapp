package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.ResponsableDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.institucion.model.ResponsableModel;

public class ResponsableMapper {
    public static ResponsableDto responsableToResponsableDto(ResponsableModel responsableModel){
        ResponsableDto  responsableDto = new ResponsableDto();
        BeanUtils.copyProperties(responsableModel, responsableDto);
        return responsableDto;
    }

    public static ResponsableModel responsableDtoToResponsable(ResponsableDto responsableDto){
        ResponsableModel responsableModel = new ResponsableModel();
        BeanUtils.copyProperties(responsableDto, responsableModel);
        return responsableModel;
    }
}
