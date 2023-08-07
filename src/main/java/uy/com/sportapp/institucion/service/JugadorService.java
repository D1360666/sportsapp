package uy.com.sportapp.institucion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.model.CargoModel;
import uy.com.sportapp.institucion.model.JugadorModel;
import uy.com.sportapp.institucion.repository.JugadorRepository;
import uy.com.sportapp.institucion.service.interfaces.iJugadorService;
import uy.com.sportapp.institucion.utils.CargoMapper;
import uy.com.sportapp.institucion.utils.JugadorMapper;

import java.util.ArrayList;

@Service
public class JugadorService implements iJugadorService {

    @Autowired
    private JugadorRepository repo;

    @Override
    public JugadorDto saveJugador(JugadorDto jugadorDto) {
        return JugadorMapper.jugadorToJugadorDto(repo.save(JugadorMapper.jugadorDtoToJugador(jugadorDto)));

    }

    @Override
    public JugadorDto updateJugador(JugadorDto jugadorDto) {
        JugadorDto j = this.findById(jugadorDto.getId());
        j.setCi(jugadorDto.getCi());
        j.setNombre(jugadorDto.getNombre());
        j.setApellido(jugadorDto.getApellido());
        j.setFnacimiento(jugadorDto.getFnacimiento());
        j.setDireccion(jugadorDto.getDireccion());
        j.setResponsable(jugadorDto.getResponsable());
        j.setTelefono(jugadorDto.getTelefono());
        j.setNroCamiseta(jugadorDto.getNroCamiseta());
        j.setVencimientoCarnet(jugadorDto.getVencimientoCarnet());

        return this.saveJugador(j);
    }

    @Override
    public JugadorDto findById(Integer id) {
        return JugadorMapper.jugadorOptToJugadorDto(repo.findById(id));
    }

    @Override
    public ArrayList<JugadorDto> findAll() {
        ArrayList<JugadorModel> lista = new ArrayList<>(repo.findAll());
        return JugadorMapper.lstJugadorModelToJugadorDto(lista);
    }
}
