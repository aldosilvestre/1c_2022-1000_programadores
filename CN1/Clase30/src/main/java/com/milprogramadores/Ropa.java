package com.milprogramadores;

public class Ropa {

    private Long id;
    private String marca;
    private Double precio;
    private String tipo;

    public Ropa(Long id, String marca, Double precio, String tipo) {
        this.id = id;
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
