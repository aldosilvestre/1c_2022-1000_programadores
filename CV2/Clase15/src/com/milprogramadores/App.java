package com.milprogramadores;

import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		
		int caracter = 0;
		
		try {
			caracter = System.in.read();			
		}catch(IOException e) {
			System.out.println("hubo un error");
		}
		
		System.out.println(caracter);

	}

}
