package uy.com.sportapp.tesoreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.tesoreria.model.PagoModel;

@Repository
public interface PagoRepository extends JpaRepository<PagoModel, Integer> {
}
