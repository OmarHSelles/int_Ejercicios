package org.aguzman.appmockito.ejemplos.services;

import org.aguzman.appmockito.ejemplos.modelos.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);
}
