package uy.com.sportapp.institucion.service.interfaces;

import uy.com.sportapp.institucion.dto.CargoDto;

import java.util.List;

public interface iCargoService {
    CargoDto saveCargo(CargoDto cargoDto);
    List<CargoDto> findAll();

}
