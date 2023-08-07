package uy.com.sportapp.institucion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.institucion.dto.ResponsableDto;
import uy.com.sportapp.institucion.model.ResponsableModel;
import uy.com.sportapp.institucion.repository.ResponsableRepository;
import uy.com.sportapp.institucion.service.interfaces.iResponsableService;
import uy.com.sportapp.institucion.utils.JugadorMapper;
import uy.com.sportapp.institucion.utils.ResponsableMapper;

import java.util.ArrayList;

@Service
public class ResponsableService implements iResponsableService {
    @Autowired
    private ResponsableRepository repo;
    @Override
    public ResponsableDto saveResponsable(ResponsableDto responsableDto) {
        return ResponsableMapper.responsableToResponsableDto(repo.save(ResponsableMapper.responsableDtoToResponsable(responsableDto)));
    }

    @Override
    public ResponsableDto updateResponsable(ResponsableDto responsableDto) {
        ResponsableDto r = this.findById(responsableDto.getId());
        r.setApellido(responsableDto.getApellido());
        r.setCi(responsableDto.getCi());
        r.setNombre(responsableDto.getNombre());
        r.setFnacimiento(responsableDto.getFnacimiento());
        r.setDireccion(responsableDto.getDireccion());
        r.setTelefono(responsableDto.getTelefono());
         return this.saveResponsable(r);
    }

    @Override
    public ResponsableDto findById(Integer id) {
        return ResponsableMapper.responsableOptToResponsableDto(repo.findById(id));
    }

    @Override
    public ArrayList<ResponsableDto> findAll() {
        ArrayList<ResponsableModel> lista = new ArrayList<>(repo.findAll());
        return ResponsableMapper.lstResponsableModelToResponsableDto(lista);
    }
}
