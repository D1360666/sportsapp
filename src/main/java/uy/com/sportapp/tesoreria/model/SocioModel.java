package uy.com.sportapp.tesoreria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Socios")
public class SocioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private int ci;
    private String direccion;
    private String telefono;
    private Double saldo;

}
