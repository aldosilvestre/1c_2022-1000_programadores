package com.milprogramadores;

public class IfElse {

	public static void main(String[] args) {
		
		int edad = 87;
		
		if(edad >= 60){
			if(edad >= 65 && edad <= 80) {
				System.out.println("tiene entre 65 y 80 años");
			}
			System.out.println("Es de la tercera edad");
		}else if(edad >= 18) {
			System.out.println("Es mayor");
		}else {
			System.out.println("Es menor");
		}
		
		System.out.println("termino el if");
	}

}
