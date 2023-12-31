package uy.com.sportapp.institucion.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponsableDto {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer ci;
    private Date fnacimiento;
    private String direccion;
    private String telefono;
}
