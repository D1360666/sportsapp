package uy.com.sportapp.institucion.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.web.servlet.MockMvc;
import uy.com.sportapp.institucion.dto.JugadorDto;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class JugadorServiceTest {

    @Autowired
    private JugadorService jugadorService;

    @Autowired
    private MockMvc mockMvc;


    @Test
    void saveJugador() {
        JugadorDto jugadorDto = new JugadorDto(1,"Joaquin","Gonzalez", 60861568, new Date("2023/05/08"),new Date("2024/06/01"),"Hugo Caballero 1969", "+598 91961445", "DG",16);
        JugadorDto jugadorGuardado = jugadorService.saveJugador(jugadorDto);
        assertEquals(jugadorDto, jugadorGuardado);

    }

    @Test
    void updateJugador() {
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }
}