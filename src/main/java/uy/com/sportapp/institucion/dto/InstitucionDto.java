package uy.com.sportapp.institucion.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InstitucionDto {
    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private Integer rut;

    private List<UsuarioDto> usuarios;
    private InstitucionDto dependiente;
}
