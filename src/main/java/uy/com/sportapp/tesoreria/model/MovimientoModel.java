package uy.com.sportapp.tesoreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
    private int id;
    private String razon;
    private Date fecha;
    private Double importe;
    private String tipo;
    private int referencia;
    @ManyToOne
    private TesoreriaModel tesoreriaModel;





}
