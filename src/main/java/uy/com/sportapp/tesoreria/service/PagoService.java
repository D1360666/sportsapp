package uy.com.sportapp.tesoreria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uy.com.sportapp.tesoreria.dto.PagoDto;
import uy.com.sportapp.tesoreria.model.PagoModel;
import uy.com.sportapp.tesoreria.repository.PagoRepository;
import uy.com.sportapp.tesoreria.service.interfaces.iPagoService;
import uy.com.sportapp.tesoreria.utils.PagoMapper;
import java.util.ArrayList;

@Service
public class PagoService implements iPagoService {

    @Autowired
    private PagoRepository repo;
    @Override
    public PagoDto savePago(PagoDto pagoDto) {
        return PagoMapper.pagoToPagoDto(repo.save(PagoMapper.pagoDtoToPago(pagoDto)));
    }

    @Override
    public PagoDto findById(Integer id) {
        return PagoMapper.pagoOptToPagoDto(repo.findById(id));
    }

    @Override
    public ArrayList<PagoDto> findAll() {
        ArrayList<PagoModel> lista = new ArrayList<>(repo.findAll());
        return PagoMapper.lstPagoModelToPagoDto(lista);

    }
}
