package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Sistema {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/clase28";
    private static final String USER = "aldo";
    private static final String PASS = "password";

    public void registrar(NuevoUsuario usuario){

        if(!usuario.getPassword().equals(usuario.getRepeatPassword())){
            throw new RuntimeException("la password y el repeat password no coinciden", null);
        }
        Connection con = null;
        Statement stm = null;

        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = con.createStatement();
            stm.executeUpdate("INSERT INTO USUARIO(nombre,apellido, password, username, email) VALUE('"+usuario.getNombre()+"', '"+usuario.getApellido()+"', '"+usuario.getPassword()+"', '"+usuario.getUsername()+"', '"+ usuario.getEmail()+"' )" );
            con.close();
            stm.close();
        }catch(SQLException e){
            System.out.println(e.getLocalizedMessage());
            
        }


    }

    public Usuario iniciarSesion(InicioSesion inicioSesion){

        Connection con = null;
        Statement stm = null;

        try{
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            stm = con.createStatement();
            
            ResultSet result = stm.executeQuery("SELECT * FROM USUARIO WHERE username='"+ inicioSesion.getUsername() +"'");
            
            if(result.next()){
                String passwordBD = result.getString("password");
                if(passwordBD.equals(inicioSesion.getPassword())){
                    if(result.getBoolean("is_admin")){
                        //return new Administrador(result.getLong("id"), result.getString("nombre"), result.getString("apellido"), result.getString("username"));
                    }else{
                        return new Cliente(result.getLong("id"), result.getString("nombre"), result.getString("apellido"), result.getString("username"));
                    }
                }else{
                    throw new RuntimeException("Constraseña incorrecta");
                }
            }else{
                throw new RuntimeException("No se encontro el usuario");
            }
        }catch(SQLException e){
            System.out.println(e.getLocalizedMessage());
            
        }
        return null;
    }

}
