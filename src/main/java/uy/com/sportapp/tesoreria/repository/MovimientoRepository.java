package uy.com.sportapp.tesoreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.tesoreria.model.MovimientoModel;

@Repository
public interface MovimientoRepository extends JpaRepository<MovimientoModel, Integer> {
}
