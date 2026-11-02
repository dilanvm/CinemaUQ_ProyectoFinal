package com.example.cinemauq;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Funcion {
    private Long id;
    private Pelicula pelicula;
    private Sala sala;
    private LocalDateTime fechaHora;
    private BigDecimal precioBase;
    private EstadoFuncion estadoFuncion;

    public Funcion(Long id, Pelicula pelicula, Sala sala, LocalDateTime fechaHora, BigDecimal precioBase, EstadoFuncion estadoFuncion) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fechaHora= fechaHora;
        if(precioBase == null || precioBase.signum() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero");
        }
        if(pelicula==null||sala==null||fechaHora==null||estadoFuncion==null){
            throw new IllegalArgumentException("Película, Sala, FechaHora, Estado Función son obligatorios");
        }
        this.precioBase = precioBase;
        this.estadoFuncion = estadoFuncion;
    }
}
