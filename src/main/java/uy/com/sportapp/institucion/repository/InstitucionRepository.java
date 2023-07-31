package uy.com.sportapp.institucion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uy.com.sportapp.institucion.model.InstitucionModel;

public interface InstitucionRepository extends JpaRepository<InstitucionModel, Integer> {
}
