package com.milprogramadores;

/**
 * Hello world!
 *
 */
public class App 
{

    
    public static void main( String[] args ){
        Sistema sistema = new Sistema();


        //NuevoUsuario nuevoUsuario = new NuevoUsuario("Gabriel", "Silvestre","gabriel@email.com", "gabriel123", "pass1234", "pass1234");
        
        //sistema.signUp(nuevoUsuario);

        InicioSesion inicioSesion = new InicioSesion("aldo123", "pass1234");

        Usuario usuario = sistema.signIn(inicioSesion);

        System.out.println(usuario.getNombre());

        System.out.println("Finalizo");

    }
}
