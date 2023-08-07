package uy.com.sportapp.institucion.service.interfaces;

import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.JugadorDto;

import java.util.ArrayList;

public interface iInstitucionService {
    InstitucionDto saveInstitucion(InstitucionDto institucionDto);
    InstitucionDto updateInstitucion(InstitucionDto institucionDto);
    InstitucionDto findById(Integer id);
    ArrayList<InstitucionDto> findAll();
}
