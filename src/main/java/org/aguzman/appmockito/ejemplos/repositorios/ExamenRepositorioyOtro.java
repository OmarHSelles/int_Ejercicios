package org.aguzman.appmockito.ejemplos.repositorios;

import org.aguzman.appmockito.ejemplos.modelos.Examen;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExamenRepositorioyOtro implements ExamenRepositorio{
    @Override
    public List<Examen> findAll() {
        try {
            System.out.printf("ExamenRepositorioyOtro");
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return List.of();
    }
}
