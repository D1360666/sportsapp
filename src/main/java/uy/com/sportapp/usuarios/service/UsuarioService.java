package uy.com.sportapp.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.mapper.UsuarioMapper;
import uy.com.sportapp.usuarios.model.Usuario;
import uy.com.sportapp.usuarios.repository.UsuarioRepository;
import uy.com.sportapp.usuarios.service.interfaces.IUsuarioService;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public List<UsuarioDto> buscarUsuarios() {
        return null;
    }

    @Override
    public UsuarioDto login(String usuario, String password) {
        return null;
    }

    @Override
    public UsuarioDto buscarUsuarioPorId(Integer id) {
        Optional<Usuario> optionalUsuario= repo.findById(id);
        return UsuarioMapper.usuarioOptToUsuarioDto(optionalUsuario);
    }

    @Override
    public UsuarioDto guardarUsuario(UsuarioDto usuarioDto) {
        return UsuarioMapper.usuarioToUsuarioDto(repo.save(UsuarioMapper.usuarioDtoToUsuario(usuarioDto)));
    }
}
