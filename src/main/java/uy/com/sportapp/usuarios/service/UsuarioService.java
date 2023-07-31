package uy.com.sportapp.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uy.com.sportapp.usuarios.dto.UsuarioDto;
import uy.com.sportapp.usuarios.utils.UsuarioMapper;
import uy.com.sportapp.usuarios.model.UsuarioModel;
import uy.com.sportapp.usuarios.repository.UsuarioRepository;
import uy.com.sportapp.usuarios.service.interfaces.IUsuarioService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository repo;

    @Override
    public List<UsuarioDto> buscarUsuarios() {
        List<UsuarioDto> listaUsuarioDto=new ArrayList<UsuarioDto>();
        return repo.findAll().stream().map(u -> {
            listaUsuarioDto.add(UsuarioMapper.usuarioToUsuarioDto(u));
            return listaUsuarioDto;
        }).collect(null);
    }

    @Override
    public UsuarioDto login(String usuario, String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        for (UsuarioModel u:repo.findAll()) {
            if( u.getUsuario().equals(usuario) && u.getPassword().equals(passwordEncoder.encode(password))){
                return UsuarioMapper.usuarioToUsuarioDto(u);
            }
        }
        return null;
    }

    @Override
    public UsuarioDto buscarUsuarioPorId(Integer id) {
        Optional<UsuarioModel> optionalUsuario= repo.findById(id);
        return UsuarioMapper.usuarioOptToUsuarioDto(optionalUsuario);
    }

    @Override
    public UsuarioDto guardarUsuario(UsuarioDto usuarioDto) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String contrasenaActual = usuarioDto.getPassword();
        usuarioDto.setPassword(passwordEncoder.encode((contrasenaActual)));
        return UsuarioMapper.usuarioToUsuarioDto(repo.save(UsuarioMapper.usuarioDtoToUsuario(usuarioDto)));
    }
}
