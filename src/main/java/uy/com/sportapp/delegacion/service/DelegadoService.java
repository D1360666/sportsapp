package uy.com.sportapp.delegacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import uy.com.sportapp.delegacion.dto.DelegadoDto;
import uy.com.sportapp.delegacion.model.DelegadoModel;
import uy.com.sportapp.delegacion.repository.DelegadoRepository;
import uy.com.sportapp.delegacion.service.interfaces.iDelegadoService;
import uy.com.sportapp.delegacion.utils.DelegadoMapper;
import java.util.ArrayList;

public class DelegadoService implements iDelegadoService {
    @Autowired
    private DelegadoRepository repo;
    @Override
    public DelegadoDto saveDelegado(DelegadoDto delegadoDto) {
        return DelegadoMapper.delegadoToDelegadoDto(repo.save(DelegadoMapper.delegadoDtoToDelegado(delegadoDto)));
    }
    @Override
    public DelegadoDto updateDelegado(DelegadoDto delegadoDto) {
        DelegadoDto d = this.findById(delegadoDto.getId());
        d.setCi(delegadoDto.getCi());
        d.setNombre(delegadoDto.getNombre());
        d.setApellido(delegadoDto.getApellido());
        d.setFnacimiento(delegadoDto.getFnacimiento());
        d.setDireccion(delegadoDto.getDireccion());
        d.setTelefono(delegadoDto.getTelefono());

        return this.saveDelegado(d);
    }
    @Override
    public DelegadoDto findById(Integer id) {
        return DelegadoMapper.delegadoOptToDelegadoDto(repo.findById(id));
    }
    @Override
    public ArrayList<DelegadoDto> findAll() {
        ArrayList<DelegadoModel> lista = new ArrayList<>(repo.findAll());
        return DelegadoMapper.lstDelegadoModelToDelegadoDto(lista);
    }
}
