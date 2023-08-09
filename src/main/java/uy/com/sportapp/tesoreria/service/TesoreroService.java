package uy.com.sportapp.tesoreria.service;

import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.TesoreroDto;
import uy.com.sportapp.tesoreria.service.interfaces.iTesoreroService;

import java.util.List;

@Service
public class TesoreroService implements iTesoreroService {
    @Override
    public TesoreroDto saveTesorero(TesoreroDto tesoreroDto) {
        return null;
    }

    @Override
    public TesoreroDto updateTesorero(TesoreroDto tesoreroDto) {
        return null;
    }

    @Override
    public TesoreroDto findById(Integer id) {
        return null;
    }

    @Override
    public List<TesoreroDto> findAll() {
        return null;
    }
}
