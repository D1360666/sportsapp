package uy.com.sportapp.delegacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uy.com.sportapp.delegacion.model.DelegadoModel;

public interface DelegadoRepository extends JpaRepository<DelegadoModel, Integer> {
}
