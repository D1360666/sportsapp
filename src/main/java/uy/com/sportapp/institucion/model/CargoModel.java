package uy.com.sportapp.institucion.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cargos")
public class CargoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cargo;

}
