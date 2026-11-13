package com.example.cinemauq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Combo implements ElementoVendible{
    private List<ElementoVendible> elementos;
    private String nombre;

    public Combo(List<ElementoVendible>elementos, String nombre){
        this.elementos=new ArrayList<>();
        this.nombre=nombre;

        if(nombre==null||nombre.isBlank()){
            throw new IllegalArgumentException("El nombre del combo es obligatorio");
        }
    }
    public void agregarElemento(ElementoVendible elemento){
        if(elemento==null){
            throw new IllegalArgumentException("El elemento es obligatorio");
        }
        if (elemento instanceof Combo){
            throw new IllegalArgumentException("Por ahora, un combo solo puede contener productos");
        }
        elementos.add(elemento);
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public BigDecimal getPrecio() {
        BigDecimal total=BigDecimal.ZERO;
        for(ElementoVendible elemento:elementos){
            total=total.add(elemento.getPrecio());
        }
        return total;
    }
    public List<ElementoVendible>getElementos(){
        return Collections.unmodifiableList(elementos);
    }
}
