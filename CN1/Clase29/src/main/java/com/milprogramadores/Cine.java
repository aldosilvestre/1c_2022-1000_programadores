package com.milprogramadores;

public class Cine {

    public void actualizarPerfil(Persona persona) {
        System.out.println(persona.getNombre());
        throw new RuntimeException("Error cualquiera");
    }

}
