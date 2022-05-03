package com.milprogramadores.models;

public abstract class Cuenta{

    private long id;
    private String cbu ;
    private double monto;
    private boolean dolares;

    public Cuenta (long id , String cbu , boolean dolares){
        this.id = id;
        this.cbu = cbu;
        this.dolares = dolares;
    }

    public double getMonto(){
        return this.monto;
    }

    public void setMonto(double monto){
        this.monto  = monto;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCbu() {
        return this.cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public boolean isDolares() {
        return this.dolares;
    }

    public boolean getDolares() {
        return this.dolares;
    }

    public void setDolares(boolean dolares) {
        this.dolares = dolares;
    }

    public double valorEnPesos(){
        if(dolares){
            monto *= 121;
            return monto;
        }
        else{
            return monto;
        }
        
    }
}