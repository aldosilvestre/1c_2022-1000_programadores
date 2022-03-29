package com.milprogramadores;

public class IfAndElse {

	public static void main(String[] args) {
		
		int edad = 64;
		
		if(edad > 60) {
			
			if(edad != 65) {
				System.out.println("no tiene 65");
			}
			System.out.println("Es de la tercera edad");
		}else if(edad > 18){
			System.out.println("Es mayor");
		}else {
			System.out.println("Es menor");
		}
		

	}

}
