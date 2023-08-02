package uy.com.sportapp.institucion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.com.sportapp.usuarios.model.UsuarioModel;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
 @Entity
@Table(name = "Instituciones")
public class InstitucionModel {
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private int rut;

    private List<UsuarioModel> usuarios;
    private InstitucionModel dependiente;

}
