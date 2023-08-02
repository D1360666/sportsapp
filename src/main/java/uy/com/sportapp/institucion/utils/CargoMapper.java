package uy.com.sportapp.institucion.utils;

import org.springframework.beans.BeanUtils;
import uy.com.sportapp.institucion.dto.CargoDto;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.model.CargoModel;
import uy.com.sportapp.institucion.model.InstitucionModel;

public class CargoMapper {
    public static CargoDto cargoToCargoDto(CargoModel cargoModel){
        CargoDto  cargoDto = new CargoDto();
        BeanUtils.copyProperties(cargoModel, cargoDto);
        return cargoDto;
    }

    public static CargoModel cargoDtoToCargo(CargoDto cargoDto){
        CargoModel cargoModel = new CargoModel();
        BeanUtils.copyProperties(cargoDto, cargoModel);
        return cargoModel;
    }
}
