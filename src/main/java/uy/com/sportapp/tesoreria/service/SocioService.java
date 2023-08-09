package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.SocioDto;
import uy.com.sportapp.tesoreria.repository.SocioRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iSocioService;
import uy.com.sportapp.tesoreria.utils.SocioMapper;

import java.util.List;

@Service
public class SocioService implements iSocioService {
    @Autowired
    private SocioRepository repo;
    @Override
    public SocioDto saveSocio(SocioDto socioDto) {
        return SocioMapper.socioToSocioDto(repo.save(SocioMapper.socioDtoToSocio(socioDto)));
    }

    @Override
    public SocioDto updateSocio(SocioDto socioDto) {
        SocioDto s = this.findById(socioDto.getId());
        s.setCi(socioDto.getCi());
        s.setDireccion(socioDto.getDireccion());
        s.setApellido(socioDto.getApellido());
        s.setSaldo(socioDto.getSaldo());
        s.setNombre(socioDto.getNombre());
        s.setTelefono(socioDto.getTelefono());

        return this.saveSocio(s);
    }


    @Override
    public SocioDto findById(Integer id) {
        return null;
    }

    @Override
    public List<SocioDto> findAll() {
        return null;
    }
}
