package uy.com.sportapp.tesoreria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tesorerias")
public class TesoreriaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private Double saldo;
    @OneToOne
    private TesoreroModel tesoreroModel;


    @Override
    public String toString() {
        return "Tesoreria{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", tesoreroDto=" + tesoreroModel +
                '}';
    }
}
