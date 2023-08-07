package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.ResponsableDto;
import uy.com.sportapp.institucion.model.ResponsableModel;
import java.util.ArrayList;
import java.util.Optional;
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

    public static ResponsableDto responsableOptToResponsableDto(Optional<ResponsableModel> optionalResponsable){
        ResponsableDto responsableDto = new ResponsableDto();
        BeanUtils.copyProperties(optionalResponsable, responsableDto);
        return responsableDto;
    }

    public static ArrayList<ResponsableDto> lstResponsableModelToResponsableDto(ArrayList<ResponsableModel> lstResponsableModel) {
        ArrayList<ResponsableDto> lista = new ArrayList<ResponsableDto>();
        BeanUtils.copyProperties(lstResponsableModel, lista);
        return lista;
    }
}
