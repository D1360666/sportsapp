package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.institucion.utils.InstitucionMapper;
import uy.com.sportapp.tesoreria.dto.MovimientoDto;
import uy.com.sportapp.tesoreria.model.MovimientoModel;
import uy.com.sportapp.tesoreria.repository.MovimientoRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iMovimientoService;
import uy.com.sportapp.tesoreria.utils.MovimientoMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoService implements iMovimientoService {

    @Autowired
    private MovimientoRepository repo;
    @Override
    public MovimientoDto saveMovimiento(MovimientoDto movimientoDto) {
        return MovimientoMapper.movimientoToMovimientoDto(repo.save(MovimientoMapper.movimientoDtoToMovimiento(movimientoDto)));
    }

    @Override
    public MovimientoDto updateMovimiento(MovimientoDto movimientoDto) {
        MovimientoDto m = this.findById(movimientoDto.getId());
        m.setFecha(movimientoDto.getFecha());
        m.setImporte(movimientoDto.getImporte());
        m.setRazon(movimientoDto.getRazon());
        m.setTipo(movimientoDto.getTipo());
        m.setReferencia(movimientoDto.getReferencia());
        m.setTesoreriaModel(movimientoDto.getTesoreriaModel());

        return this.saveMovimiento(m);
    }

    @Override
    public MovimientoDto findById(Integer id) {

        return MovimientoMapper.movimientoOptToMovimientoDto(repo.findById(id));
    }

    @Override
    public ArrayList<MovimientoDto> findAll() {
        ArrayList<MovimientoModel> lista = new ArrayList<>(repo.findAll());
        return MovimientoMapper.lstMovimientoModelToMovimientoDto(lista);

    }
}
