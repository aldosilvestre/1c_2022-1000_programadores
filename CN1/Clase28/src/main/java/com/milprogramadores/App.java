package com.milprogramadores;

/**
 * Hello world!
 */
public final class App {

    

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        Sistema sistema = new Sistema();

        // NuevoUsuario nuevoRegistro = new NuevoUsuario("Aldo", "Silvestre", "aldo123", "1234Pass", "aldo@email.com", "123Pass");

        // sistema.registrar(nuevoRegistro);

        InicioSesion is = new InicioSesion("aldo123", "1234Pass");

        Usuario usuario = sistema.iniciarSesion(is);

        System.out.println(usuario.getUsername());

        System.out.println("Finalizado");

    }
}
