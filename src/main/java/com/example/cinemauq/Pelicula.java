package com.example.cinemauq;

public class Pelicula {
    private Long id;
    private String titulo;
    private String sinopsis;
    private int duracionMinutos;
    private String clasificacionEdad;
    private String genero;


    public Pelicula(String titulo, String sinopsis,String clasificacionEdad, String genero, Long id, int duracionMinutos) {
        if(titulo==null){
            throw new IllegalArgumentException ("El titulo no puede estar vacío");
        }
        if(duracionMinutos<=0){
            throw new IllegalArgumentException("La duración debe ser mayor a 0");
        }
        this.titulo = titulo;
        this.sinopsis=sinopsis;
        this.clasificacionEdad=clasificacionEdad;
        this.genero=genero;
        this. id=id;
        this.duracionMinutos=duracionMinutos;
    }

}
