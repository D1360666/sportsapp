package uy.com.sportapp.tesoreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.tesoreria.model.SocioModel;

@Repository
public interface SocioRepository extends JpaRepository<SocioModel, Integer> {
}
