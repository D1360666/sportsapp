package uy.com.sportapp.institucion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Cargos")
public class CargoModel {
    private Integer id;
    private String cargo;

}
