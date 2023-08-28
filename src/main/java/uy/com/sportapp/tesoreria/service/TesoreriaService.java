package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.TesoreriaDto;
import uy.com.sportapp.tesoreria.model.TesoreriaModel;
import uy.com.sportapp.tesoreria.repository.TesoreriaRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iTesoreriaService;
import uy.com.sportapp.tesoreria.utils.TesoreriaMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class TesoreriaService implements iTesoreriaService {
    @Autowired
    private TesoreriaRepository repo;
    @Override
    public TesoreriaDto saveTesoreria(TesoreriaDto tesoreriaDto) {
        return TesoreriaMapper.tesoreriaToTesoreriaDto(repo.save(TesoreriaMapper.tesoreriaDtoToTesoreria(tesoreriaDto)));
    }

    @Override
    public TesoreriaDto updateTesoreria(TesoreriaDto tesoreriaDto) {
        TesoreriaDto t = this.findById(tesoreriaDto.getId());
        t.setNombre(tesoreriaDto.getNombre());
        t.setSaldo(tesoreriaDto.getSaldo());
        t.setTesoreroDto(tesoreriaDto.getTesoreroDto());

        return this.saveTesoreria(t);
    }

    @Override
    public TesoreriaDto findById(Integer id) {
        return TesoreriaMapper.tesoreriaOptToTesoreriaDto(repo.findById(id));
    }

    @Override
    public List<TesoreriaDto> findAll() {
        ArrayList<TesoreriaModel> lista = new ArrayList<>(repo.findAll());
        return TesoreriaMapper.lstTesoreriaModelToTesoreriaDto(lista);
    }
}
