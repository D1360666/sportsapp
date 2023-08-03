package uy.com.sportapp.institucion.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Responsables")
public class ResponsableModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private int ci;
    private Date fnacimiento;
    private String direccion;
    private String telefono;
}
