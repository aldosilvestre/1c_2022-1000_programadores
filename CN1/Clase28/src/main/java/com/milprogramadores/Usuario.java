package com.milprogramadores;

public class Usuario {
    
    private Long id;
    private String nombre;
    private String apellido;
    private String username;


    public Usuario(Long id, String nombre, String apellido, String username) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
