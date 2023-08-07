package uy.com.sportapp.institucion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.institucion.dto.CargoDto;
import uy.com.sportapp.institucion.model.CargoModel;
import uy.com.sportapp.institucion.repository.CargoRepository;
import uy.com.sportapp.institucion.service.interfaces.iCargoService;
import uy.com.sportapp.institucion.utils.CargoMapper;
import java.util.ArrayList;

@Service
public class CargoService implements iCargoService {

    @Autowired
    private CargoRepository repo;

    @Override
    public CargoDto saveCargo(CargoDto cargoDto) {
        return CargoMapper.cargoToCargoDto(repo.save(CargoMapper.cargoDtoToCargo(cargoDto)));
    }

    @Override
    public ArrayList<CargoDto> findAll() {
        ArrayList<CargoModel> lista = new ArrayList<>(repo.findAll());
        return CargoMapper.lstCargoModelToCargoDto(lista);
    }
}
