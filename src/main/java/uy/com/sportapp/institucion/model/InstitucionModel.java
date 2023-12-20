package uy.com.sportapp.institucion.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.com.sportapp.usuarios.model.UsuarioModel;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Instituciones")
public class InstitucionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Integer rut;

    @OneToMany
    private List<UsuarioModel> usuarios;
    @OneToMany
    private ArrayList<InstitucionModel> dependientes;

}
