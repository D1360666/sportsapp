package uy.com.sportapp.tesoreria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pagos")
public class PagoModel {
    private Integer id;
    private SocioModel socio;
    private Double importe;
    private String razon;
    private Date fecha;
}
