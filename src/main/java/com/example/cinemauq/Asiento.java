package com.example.cinemauq;

public class Asiento {
    private Long id;
    private String fila;
    private int numero;
    private TipoAsiento tipoAsiento;

    public Asiento(Long id, String fila, int numero, TipoAsiento tipoAsiento){
        this.id=id;
        this.fila=fila.trim();
        this.numero=numero;
        this.tipoAsiento=tipoAsiento;
        if(fila.isBlank()){
            throw new IllegalArgumentException("La fila no puede estar vacía");
        }
        if(numero<=0){
            throw new IllegalArgumentException("El numero de asiento debe ser mayor que cero");
        }
        if(tipoAsiento==null){
            throw new IllegalArgumentException("El tipo de asiento es obligatorio");
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoAsiento getTipoAsiento() {
        return tipoAsiento;
    }

    public void setTipoAsiento(TipoAsiento tipoAsiento) {
        this.tipoAsiento = tipoAsiento;
    }
}
