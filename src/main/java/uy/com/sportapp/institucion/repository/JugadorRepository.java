package uy.com.sportapp.institucion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.institucion.model.JugadorModel;

@Repository
public interface JugadorRepository extends JpaRepository<JugadorModel, Integer> {
}
