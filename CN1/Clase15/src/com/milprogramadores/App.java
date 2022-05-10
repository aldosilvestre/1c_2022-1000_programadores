package com.milprogramadores;

import java.io.File;

public class App {

	public static void main(String[] args) throws Exception{
		
		File carpeta = new File("./src", "resources");
		carpeta.mkdir();
		
		File nuevoArchivo = new File(carpeta, "archivo_prueba.txt");
		nuevoArchivo.createNewFile();
		
	}
	
}
