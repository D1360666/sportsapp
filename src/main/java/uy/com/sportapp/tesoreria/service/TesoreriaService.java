package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.TesoreriaDto;
import uy.com.sportapp.tesoreria.repository.TesoreriaRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iTesoreriaService;

import java.util.List;

@Service
public class TesoreriaService implements iTesoreriaService {
    @Autowired
    private TesoreriaRepository repo;
    @Override
    public TesoreriaDto saveTesoreria(TesoreriaDto tesoreriaDto) {
        return null;
    }

    @Override
    public TesoreriaDto updateTesoreria(TesoreriaDto tesoreriaDto) {
        return null;
    }

    @Override
    public TesoreriaDto findById(Integer id) {
        return null;
    }

    @Override
    public List<TesoreriaDto> findAll() {
        return null;
    }
}
