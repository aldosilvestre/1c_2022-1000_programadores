package com.milprogramadores.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {


    /*
    * El cliente debe tener un constructor con el id, nombre, apellido, dni
        //Cliente cliente1 = new Cliente(Long.valueOf(1), "Alberto", "Sarasa", 20255856);
    */

    private long id;
    private String nombre;
    private String apellido;
    private long dni;
    private List<Cuenta> cuentas;

    public Cliente(long id, String nombre, String apellido, long dni){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = new ArrayList<Cuenta>();
    }
    //10000000
    public boolean pagarBienes(){
        double aux=0;
    
      for(Cuenta cuenta : cuentas){
          aux += cuenta.valorEnPesos();
      }
        if (aux > 10000000){
            return true;
        }else{
            return false;
        }
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return this.dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public List<Cuenta> getCuentas() {
        return this.cuentas;
    }

    public void setCuentas(List<Cuenta> listaCuentas) {
        this.cuentas = listaCuentas;
    }


}