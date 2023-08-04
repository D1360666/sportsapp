package uy.com.sportapp.institucion.service.interfaces;

import uy.com.sportapp.institucion.dto.JugadorDto;

import java.util.ArrayList;

public interface iJugadorService {
    JugadorDto saveJugador(JugadorDto jugadorDto);
    JugadorDto updateJugador(JugadorDto jugadorDto);
    JugadorDto findById(Integer id);
    ArrayList<JugadorDto> findAll();

}
