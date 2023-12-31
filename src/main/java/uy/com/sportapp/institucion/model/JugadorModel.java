package uy.com.sportapp.institucion.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Jugadores")
public class JugadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer ci;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fnacimiento;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date vencimientoCarnet;
    private String direccion;
    private String telefono;
    @OneToOne
    private ResponsableModel responsable;
    private int nroCamiseta;

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
