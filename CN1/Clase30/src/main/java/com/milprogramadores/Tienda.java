package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    
    private static final String URL_BD = "jdbc:mysql://localhost:3306/m52";
    private static final String USER = "aldo";
    private static final String PASS = "password";


    private Statement getStatement(){
        try{
            Connection conn = DriverManager.getConnection(URL_BD, USER, PASS);
            Statement stm = conn.createStatement();
            return stm;
        }catch(SQLException e){
            System.out.println("No se pudo conectar");
        }
        return null;
    }

    public List<Ropa> getPrendas(){
        List<Ropa> listaRopa = new ArrayList<Ropa>();
        Statement stm = this.getStatement();
        try{
            ResultSet rs = stm.executeQuery("select * from ROPA");
            while(rs.next()){
                Ropa unaRopa = new Ropa(rs.getLong("id"), rs.getString("marca"), rs.getDouble("precio"), rs.getString("tipo"));
                listaRopa.add(unaRopa);
            }
            stm.close();
            return listaRopa;
        }catch(SQLException e){
            System.out.println(e.getLocalizedMessage());
        }
        return listaRopa;
    }

    public void guardarNuevaPrenda(Ropa nuevaPrenda) throws SQLException{
        Statement stm = getStatement();
            stm.executeUpdate("Insert into ROPA(marca, precio, tipo) value ('" + nuevaPrenda.getMarca()+ "',"+ nuevaPrenda.getPrecio()+",'"+ nuevaPrenda.getTipo()+"')");
            stm.close();
    }

    public Boolean isAdmin(Usuario usuario) {
        
        Statement stm = getStatement();

        try{

            ResultSet rs = stm.executeQuery("select is_admin from USUARIO where email='"+usuario.getEmail()+"'");

            if(rs.next()){
                return rs.getBoolean(1);
            }

        }catch(SQLException e){
            System.out.println(e.getLocalizedMessage());
        }
                
        return false;
    }



}
