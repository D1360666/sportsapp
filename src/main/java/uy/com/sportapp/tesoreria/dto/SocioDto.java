package uy.com.sportapp.tesoreria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocioDto {
    private int id;
    private String nombre;
    private String apellido;
    private int ci;
    private String direccion;
    private String telefono;
    private Double saldo;
}