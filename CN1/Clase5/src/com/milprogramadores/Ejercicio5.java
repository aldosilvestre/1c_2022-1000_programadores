package com.milprogramadores;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Crear un método que permita ingresar usuario y contraseña para que 
		 * el usuario y contraseña sean válidos el usuario tiene que ser igual 
		 * a cris1234 y la contraseña igual a xf3C#, si el logueo es exitoso 
		 * devolver true sino false. El usuario y contraseña son ingresados 
		 * en el main, si es exitoso mostrar “logueo exitoso”, 
		 * sino “error logueo”.
		 * */
		
		boolean loginExitoso = login("cris1234", "xf3C#");
		if(loginExitoso) {
			System.out.println("logueo exitoso");
		}else {
			System.out.println("error logueo");
		}
		
	}
	
	public static boolean login(String username, String password) {
		if(username == "cris1234" && password == "xf3C#") {
			return true;
		}else {
			return false;
		}
	}
	

}
