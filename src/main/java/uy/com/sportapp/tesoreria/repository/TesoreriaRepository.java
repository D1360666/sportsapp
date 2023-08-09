package uy.com.sportapp.tesoreria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.com.sportapp.tesoreria.model.TesoreriaModel;

@Repository
public interface TesoreriaRepository extends JpaRepository<TesoreriaModel, Integer> {
}
