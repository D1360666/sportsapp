package uy.com.sportapp.usuarios.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Roles")
public class RolModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="rol_id")
    private Set<RolModel> usuarios;

}
