package org.aguzman.appmockito.ejemplos.services;

import org.aguzman.appmockito.ejemplos.modelos.Examen;
import org.aguzman.appmockito.ejemplos.repositorios.ExamenRepositorio;
import org.aguzman.appmockito.ejemplos.repositorios.ExamenRepositorioyOtro;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ExamenServiceImplTest {

    @Test
    void findExamenPorNombre() {
        ExamenRepositorio repositorio = mock(ExamenRepositorioyOtro.class);
        ExamenService service = new ExamenServiceImpl(repositorio);
        List<Examen> datos = Arrays.asList(new Examen(5L, "Matematicas")
                , new Examen(6L, "Lenguaje")
                , new Examen(7L, "Historia"));

        when(repositorio.findAll()).thenReturn(datos);
        Optional <Examen> examen = service.findExamenPorNombre("Matematicas");


        assertTrue(examen.isPresent());
        assertEquals(5, examen.orElseThrow().getId());
        assertEquals("Matematicas", examen.get().getNombre());
    }

    @Test
    void findExamenPorNombreListaVacia() {
        ExamenRepositorio repositorio = mock(ExamenRepositorioyOtro.class);
        ExamenService service = new ExamenServiceImpl(repositorio);
        List<Examen> datos = Collections.emptyList();

        when(repositorio.findAll()).thenReturn(datos);
        Optional <Examen> examen = service.findExamenPorNombre("Matematicas");


        assertTrue(examen.isPresent());
        assertEquals(5, examen.orElseThrow().getId());
        assertEquals("Matematicas", examen.get().getNombre());
    }
}