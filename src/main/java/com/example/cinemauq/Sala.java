package com.example.cinemauq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sala {
    private String nombre;
    private Long id;
    private List<Asiento> asientos;
    private boolean activa;

    public Sala(String nombre, Long id, List<Asiento>asientos,boolean activa){
        this.nombre=nombre;
        this.id=id;
        this.asientos=new ArrayList<>();
        this.activa=activa;

        if(nombre==null||nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
    }
    public void agregarAsiento(Asiento asiento){
        if(asiento==null){
            throw new IllegalArgumentException("El asiento es obligatorio");
        }
        boolean repetido=asientos.stream().anyMatch(a->a.getFila().equalsIgnoreCase(asiento.getFila())&&a.getNumero()==asiento.getNumero());
        if(repetido){
            throw new IllegalArgumentException("Ya existe ese asiento en la sala");
        }
        asientos.add(asiento);
    }
    public int getCapacidad(){
        return  asientos.size();
    }
    public List<Asiento>getAsientos(){
        return Collections.unmodifiableList(asientos);
    }

}
