package org.aguzman.appmockito.ejemplos.repositorios;

import org.aguzman.appmockito.ejemplos.modelos.Examen;

import java.util.List;

public interface ExamenRepositorio {
    List<Examen> findAll();
}
