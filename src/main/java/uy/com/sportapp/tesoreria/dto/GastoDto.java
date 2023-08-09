package uy.com.sportapp.tesoreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.com.sportapp.tesoreria.model.SocioModel;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GastoDto {
    private Integer id;
    private SocioModel socio;
    private Double importe;
    private String razon;
    private Date fecha;
}
