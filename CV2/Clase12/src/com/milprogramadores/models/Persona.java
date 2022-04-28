package com.milprogramadores.models;

public class Persona {
    
    private String nombre;
    private String apellido;

    // por defecto
    public Persona(){}

    // parciales no paso todos los valores para atributos
    public Persona(String nombre){
        this.nombre = nombre;
    }

    // totales all arguments todos los atributos de la clase 
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // De clonado 
    public Persona(Persona persona){
        this.nombre = persona.nombre;
        this.apellido = persona.apellido;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public static String devuelveHola(){
        return "Hola";
    }

}
