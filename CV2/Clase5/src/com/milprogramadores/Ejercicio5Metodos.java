package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio5Metodos {

	public static void main(String[] args) {
		/*
		 * Crear un método que permita ingresar usuario y contraseña para que el usuario 
		 * y contraseña sean válidos el usuario tiene que ser igual a cris1234 y la 
		 * contraseña igual a xf3C#, si el logueo es exitoso devolver true sino false. 
		 * El usuario y contraseña son ingresados en el main, si es exitoso 
		 * mostrar “logueo exitoso”, sino “error logueo”
		 */

		Scanner scn = new Scanner(System.in);
		
		String nombreUsuario = scn.nextLine();
		String contrasenia = scn.nextLine();
		
		System.out.println(nombreUsuario);
		System.out.println(contrasenia);
		
		boolean loginExitoso = login(nombreUsuario.trim(), contrasenia.trim());
		// if(<boolean>)
		if(loginExitoso) {
			System.out.println("logueo exitoso");
		}else {
			System.out.println("error logueo");
		}
	}
	
	public static boolean login(String username, String password) {
		if( username.equals("cris1234") && password.equals("xf3C#")) {
			return true;
		}else {
			return false;
		}
	}
	
}
