package com.milprogramadores;

public class Prueba {

	public static void main(String[] args) {
		
		try {
			System.out.println(5 / 0);			
		}catch(ArithmeticException e) {
			System.err.println(e);
		}
		
		System.out.println("HOla mundo");
		
	}

}
