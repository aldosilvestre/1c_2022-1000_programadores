package com.milprogramadores;

public class NuevoUsuario {
   
    private String nombre;
    private String apellido;
    private String username;
    private String password;
    private String email;
    private String repeatPassword;
    private Boolean isAdmin = false;

    public NuevoUsuario(String nombre, String apellido, String username, String password, String email, String repeatPassword) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.password = password;
        this.email = email;
        this.repeatPassword = repeatPassword;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRepeatPassword() {
        return this.repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }


    public Boolean isIsAdmin() {
        return this.isAdmin;
    }

    public Boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

}
