package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.TesoreroDto;
import uy.com.sportapp.tesoreria.model.TesoreroModel;
import uy.com.sportapp.tesoreria.repository.TesoreroRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iTesoreroService;
import uy.com.sportapp.tesoreria.utils.TesoreroMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class TesoreroService implements iTesoreroService {

    @Autowired
    private TesoreroRepository repo;

    @Override
    public TesoreroDto saveTesorero(TesoreroDto tesoreroDto) {
        return TesoreroMapper.tesoreroToTesoreroDto(repo.save(TesoreroMapper.tesoreroDtoToTesorero(tesoreroDto)));
    }

    @Override
    public TesoreroDto updateTesorero(TesoreroDto tesoreroDto) {
        TesoreroDto t = this.findById(tesoreroDto.getId());
        t.setApellido(tesoreroDto.getApellido());
        t.setCi(tesoreroDto.getCi());
        t.setDireccion(tesoreroDto.getDireccion());
        t.setNombre(tesoreroDto.getNombre());
        t.setFnacimiento(tesoreroDto.getFnacimiento());
        t.setTelefono(tesoreroDto.getTelefono());

        return this.saveTesorero(t);
    }

    @Override
    public TesoreroDto findById(Integer id) {
        return TesoreroMapper.tesoreroOptToTesoreroDto(repo.findById(id));
    }

    @Override
    public ArrayList<TesoreroDto> findAll() {
        ArrayList<TesoreroModel> lista = new ArrayList<>(repo.findAll());
        return TesoreroMapper.lstTesoreroModelToTesoreroDto(lista);
    }
}
