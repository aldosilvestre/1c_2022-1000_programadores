package com.milprogramadores;

public class Sabor {

    private String nombre;
    private String descripcion;
    private Double precio;
    private String tipo;

    public Sabor(String nombre, String descripcion, Double precio, String tipo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



}
