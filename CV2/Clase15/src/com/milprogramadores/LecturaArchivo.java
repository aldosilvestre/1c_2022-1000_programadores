package com.milprogramadores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LecturaArchivo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("./src/resources/archivo_prueba.txt");
		
//		int valor = 0;
//		
//		while( (valor = fr.read())  != -1 ) {
//			System.out.print((char) valor);
//		}
//		System.out.println("Fin.");
		
		
		BufferedReader buffer = new BufferedReader(fr);
		
		String valorS = "";
		while( (valorS = buffer.readLine()) != null ) {
			System.out.println(valorS);
		}
		
		buffer.close();
		fr.close();
	}

}
