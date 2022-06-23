package com.milprogramadores;

import java.util.List;

public class Cliente extends Usuario{
    

    
    public Cliente(Long id, String nombre, String apellido, String username) {
        super(id, nombre, apellido, username);
    }

    private List<String> bienes;

}
