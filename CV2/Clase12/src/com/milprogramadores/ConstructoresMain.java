package com.milprogramadores;

import com.milprogramadores.models.Persona;

public class ConstructoresMain {
    

    public static void main(String[] args) {
        
        Persona nuevaPersona = new Persona("Aldo", "Silvestre");
        Persona personaClon = new Persona(nuevaPersona);

        System.out.println(nuevaPersona.getNombre());
        System.out.println(personaClon.getNombre());

        nuevaPersona.getNombre();

        Persona.devuelveHola();

    }



}
