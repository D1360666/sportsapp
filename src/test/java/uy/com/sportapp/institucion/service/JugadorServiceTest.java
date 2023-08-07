package uy.com.sportapp.institucion.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.web.servlet.MockMvc;
import uy.com.sportapp.institucion.dto.JugadorDto;
import uy.com.sportapp.institucion.dto.ResponsableDto;
import uy.com.sportapp.institucion.model.JugadorModel;
import uy.com.sportapp.institucion.model.ResponsableModel;
import uy.com.sportapp.institucion.repository.JugadorRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DataJpaTest
class JugadorServiceTest {

    @Mock
    private JugadorRepository jugadorRepository;

    @InjectMocks
    private JugadorService jugadorService;

    @Test
    void saveJugador() {

    }

    @Test
    void updateJugador() {
    }

 /*   @Test
    void findById() {
        JugadorModel jugadorModel = new JugadorModel();
        jugadorModel.setId(2);
        jugadorModel.setCi(40429767);
        jugadorModel.setNombre("Diego");
        jugadorModel.setApellido("G");
        jugadorModel.setDireccion("pepe 804");
        jugadorModel.setFnacimiento(new Date("2014-05-08"));
        jugadorModel.setTelefono("h c 1969");
        jugadorModel.setResponsable(new ResponsableModel(1, "D", "G", 40429767, new Date("1988-04-06"), "direccion", "telefono"));
        jugadorModel.setNroCamiseta(16);
        jugadorModel.setVencimientoCarnet(new Date("2024-06-01"));

        when(jugadorRepository.findById(anyInt())).thenReturn(Optional.of(jugadorModel));

        //Optional<JugadorDto> returnedJugador = this.jugadorService.findById(2);

        assertTrue(returnedJugador.isPresent());
        verify(this.jugadorRepository).findById(2);

    }*/

    @Test
    void findAll() {
        JugadorModel jugadorModel = new JugadorModel();
        jugadorModel.setId(1);
        jugadorModel.setCi(40429767);
        jugadorModel.setNombre("Diego");
        jugadorModel.setApellido("G");
        jugadorModel.setDireccion("pepe 804");
        jugadorModel.setFnacimiento(new Date("2014-05-08"));
        jugadorModel.setTelefono("h c 1969");
        jugadorModel.setResponsable(new ResponsableModel(1, "D", "G", 40429767, new Date("1988-04-06"), "direccion", "telefono"));
        jugadorModel.setNroCamiseta(16);
        jugadorModel.setVencimientoCarnet(new Date("2024-06-01"));

        when(jugadorRepository.findAll()).thenReturn(List.of(jugadorModel));
        List jugadores = this.jugadorService.findAll();

        assertEquals(List.of(jugadorModel), jugadores);
        verify(this.jugadorRepository).findAll();
    }
}