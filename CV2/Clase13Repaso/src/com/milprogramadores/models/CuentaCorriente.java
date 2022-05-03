package com.milprogramadores.models;

import java.util.List;

public class CuentaCorriente extends Cuenta{
    private List<Chequera> chequeras;
    
  public CuentaCorriente(long id , String cbu , boolean dolares){
        super(id, cbu, dolares); 
  }


    public List<Chequera> getChequeras() {
        return this.chequeras;
    }

    public void setChequeras(List<Chequera> chequeras) {
        this.chequeras = chequeras;
    }

    
}
