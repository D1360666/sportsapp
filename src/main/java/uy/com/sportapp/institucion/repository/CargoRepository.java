package uy.com.sportapp.institucion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.institucion.model.CargoModel;

@Repository
public interface CargoRepository extends JpaRepository<CargoModel, Integer> {
}
