package org.aguzman.appmockito.ejemplos.services;

import org.aguzman.appmockito.ejemplos.modelos.Examen;
import org.aguzman.appmockito.ejemplos.repositorios.ExamenRepositorio;

import java.util.Optional;

public class ExamenServiceImpl implements ExamenService {
    private ExamenRepositorio examenRepositorio;

    public ExamenServiceImpl(ExamenRepositorio examenRepositorio) {
        this.examenRepositorio = examenRepositorio;
    }

    @Override
    public Optional<Examen> findExamenPorNombre(String nombre) {
        return examenRepositorio.findAll()
                .stream()
                .filter(e -> e.getNombre().contains(nombre))
                .findFirst();


    }
}
