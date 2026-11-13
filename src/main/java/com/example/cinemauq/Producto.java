package com.example.cinemauq;

import java.math.BigDecimal;

public class Producto implements ElementoVendible{
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private boolean disponible;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, String descripcion, BigDecimal precio, boolean disponible){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.disponible=disponible;


    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    @Override
    public BigDecimal getPrecio(){
        return precio;
    }
    @Override
    public String getNombre(){
        return nombre;
    }
}
