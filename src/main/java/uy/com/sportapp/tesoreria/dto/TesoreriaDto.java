package uy.com.sportapp.tesoreria.dto;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TesoreriaDto {
    private int id;
    private String nombre;
    private Double saldo;
    @OneToOne
    private TesoreroDto tesoreroDto;
}
