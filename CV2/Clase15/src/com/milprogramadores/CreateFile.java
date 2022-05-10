package com.milprogramadores;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		File nuevaCarpeta = new File("./src/resources"); 
		nuevaCarpeta.mkdir();
		
		File archivoNuevo = new File(nuevaCarpeta, "archivo_prueba.txt");
		
		if(!archivoNuevo.exists()) {
			archivoNuevo.createNewFile();
			System.out.println("archivo creado!");
		}
		
		System.out.println("FIN");
		
	}

}
