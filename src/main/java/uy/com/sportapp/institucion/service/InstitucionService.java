package uy.com.sportapp.institucion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.institucion.dto.InstitucionDto;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.model.InstitucionModel;
import uy.com.sportapp.institucion.model.JugadorModel;
import uy.com.sportapp.institucion.repository.InstitucionRepository;
import uy.com.sportapp.institucion.service.interfaces.iInstitucionService;
import uy.com.sportapp.institucion.utils.InstitucionMapper;
import uy.com.sportapp.institucion.utils.JugadorMapper;

import java.util.ArrayList;

@Service
public class InstitucionService implements iInstitucionService {

    @Autowired
    private InstitucionRepository repo;

    @Override
    public InstitucionDto saveInstitucion(InstitucionDto institucionDto) {
        return InstitucionMapper.institucionToInstitucionDto(repo.save(InstitucionMapper.institucionDtoToInstitucion(institucionDto)));
    }

    @Override
    public InstitucionDto updateInstitucion(InstitucionDto institucionDto) {
       InstitucionDto i = this.findById(institucionDto.getId());
       i.setDireccion(institucionDto.getDireccion());
       i.setNombre(institucionDto.getNombre());
       i.setTelefono(institucionDto.getTelefono());
       i.setEmail(institucionDto.getEmail());
       i.setDependiente(institucionDto.getDependiente());
       i.setRut(institucionDto.getRut());
       i.setUsuarios(institucionDto.getUsuarios());

        return this.saveInstitucion(i);
    }

    @Override
    public InstitucionDto findById(Integer id) {
        return InstitucionMapper.institucionOptToInstitucionDto(repo.findById(id));

    }

    @Override
    public ArrayList<InstitucionDto> findAll() {
        ArrayList<InstitucionModel> lista = new ArrayList<>(repo.findAll());
        return InstitucionMapper.lstInstucionModelToInstitucionDto(lista);
    }
}
