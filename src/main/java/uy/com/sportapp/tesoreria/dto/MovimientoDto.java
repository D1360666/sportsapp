package uy.com.sportapp.tesoreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.com.sportapp.tesoreria.model.TesoreriaModel;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoDto {
    private Integer id;
    private String razon;
    private Date fecha;
    private Double importe;
    private String tipo;
    private Integer referencia;
    private TesoreriaModel tesoreriaModel;
}
