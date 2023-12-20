package uy.com.sportapp.usuarios.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer ci;
    private Date fnacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private String usuario;
    private String password;

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ci=" + ci +
                ", fnacimiento=" + fnacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
