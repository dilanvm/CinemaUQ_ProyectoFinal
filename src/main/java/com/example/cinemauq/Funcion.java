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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public BigDecimal getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(BigDecimal precioBase) {
        this.precioBase = precioBase;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public EstadoFuncion getEstadoFuncion() {
        return estadoFuncion;
    }

    public void setEstadoFuncion(EstadoFuncion estadoFuncion) {
        this.estadoFuncion = estadoFuncion;
    }

    public Funcion(Long id, Pelicula pelicula, Sala sala, LocalDateTime fechaHora, BigDecimal precioBase, EstadoFuncion estadoFuncion) {
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.fechaHora= fechaHora;
        this.precioBase=precioBase;
        this.estadoFuncion=estadoFuncion;
        if(precioBase == null || precioBase.signum() <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero");
        }
        if(pelicula==null||sala==null||fechaHora==null||estadoFuncion==null){
            throw new IllegalArgumentException("Película, Sala, FechaHora, Estado Función son obligatorios");
        }


    }
}
