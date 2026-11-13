package com.example.cinemauq;

public class Pelicula {
    private Long id;
    private String titulo;
    private String sinopsis;
    private int duracionMinutos;
    private String clasificacionEdad;
    private String genero;


    public Pelicula(Long id,String titulo, String sinopsis,int duracionMinutos,String clasificacionEdad,String genero) {
        if(titulo==null||titulo.isBlank()){
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
