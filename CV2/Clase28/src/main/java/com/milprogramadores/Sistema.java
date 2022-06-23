package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sistema {
    
        
    private static final String BD_URL = "jdbc:mysql://localhost:3306/clase28";
    private static final String USER = "aldo";
    private static final String PASS = "password";



    /** <p>Metodo para Registrarse</p>
     * 
     * @param nuevoUsuario
     */
    public void signUp(NuevoUsuario nuevoUsuario){

        if(!nuevoUsuario.getPassword().equals(nuevoUsuario.getRepeatPassword())){
            throw new RuntimeException("Las contraseñas no coinciden");
        }

        Connection con = null;
        Statement stm = null;
        try {
            con = DriverManager.getConnection(BD_URL, USER, PASS);
            stm = con.createStatement();
            stm.executeUpdate("insert into USUARIO(nombre, apellido, email, username, password) value('"+ 
                                nuevoUsuario.getNombre() +"','"+ nuevoUsuario.getApellido()+"','"+ nuevoUsuario.getEmail() +
                                "','"+nuevoUsuario.getUsername()+"','"+ nuevoUsuario.getPassword()+"')");
            stm.close();
            con.close();
        }catch(SQLException e){
            System.out.println(e.getLocalizedMessage());
        }
    }



    /** <p>Metodo para iniciar sesion</p>
     * 
     * @param inicioSesion
     * @return {@link Usuario}
     */
    public Usuario signIn(InicioSesion inicioSesion){

        Connection con = null;
        Statement stm = null;
        try {
            con = DriverManager.getConnection(BD_URL, USER, PASS);
            stm = con.createStatement();
            
            ResultSet result = stm.executeQuery("select * from USUARIO where username='" + inicioSesion.getUsername() + "'");

            if(result.next()){

                if( result.getString("password").equals(inicioSesion.getPassword())){

                    if(result.getBoolean("is_admin")){
                        // Admin
                        return new Administrador(result.getString("nombre"), result.getString("apellido"), result.getString("email"));
                    }else{
                        // cliente / paciente / alumno / socio
                        return new Cliente(result.getString("nombre"), result.getString("apellido"), result.getString("email"));
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
