package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.GastoDto;
import uy.com.sportapp.tesoreria.model.GastoModel;
import uy.com.sportapp.tesoreria.repository.GastoRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iGastoService;
import uy.com.sportapp.tesoreria.utils.GastoMapper;

import java.util.ArrayList;
import java.util.List;

@Service
public class GastoService implements iGastoService {

    @Autowired
    private GastoRepository repo;

    @Override
    public GastoDto saveGasto(GastoDto gastoDto) {
        return GastoMapper.gastoToGastoDto(repo.save(GastoMapper.gastoDtoToGasto(gastoDto)));
    }

    @Override
    public GastoDto findById(Integer id) {
        return GastoMapper.gastoOptToGastoDto(repo.findById(id));
    }

    @Override
    public ArrayList<GastoDto> findAll() {
        ArrayList<GastoModel> lista = new ArrayList<>(repo.findAll());
        return GastoMapper.lstGastoModelToGastoDto(lista);

    }
}
