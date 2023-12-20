package uy.com.sportapp.institucion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JugadorDto {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer ci;
    private Date fnacimiento;
    private Date vencimientoCarnet;
    private String direccion;
    private String telefono;
    private ResponsableDto responsable;
    private Integer nroCamiseta;


    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ci=" + ci +
                ", fnacimiento=" + fnacimiento +
                ", vencimientoCarnet=" + vencimientoCarnet +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", responsable='" + responsable + '\'' +
                ", nroCamiseta=" + nroCamiseta +
                '}';
    }
}
