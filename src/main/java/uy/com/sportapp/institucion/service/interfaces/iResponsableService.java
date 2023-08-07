package uy.com.sportapp.institucion.service.interfaces;


import uy.com.sportapp.institucion.dto.ResponsableDto;
import java.util.ArrayList;

public interface iResponsableService {
    ResponsableDto saveResponsable(ResponsableDto responsableDto);
    ResponsableDto updateResponsable(ResponsableDto responsableDto);
    ResponsableDto findById(Integer id);
    ArrayList<ResponsableDto> findAll();
}
