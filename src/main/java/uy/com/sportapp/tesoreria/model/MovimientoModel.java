package uy.com.sportapp.tesoreria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Movimientos")
public class MovimientoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String razon;
    private Date fecha;
    private Double importe;
    private String tipo;
    private int referencia;
    @ManyToOne
    private TesoreriaModel tesoreriaModel;





}
