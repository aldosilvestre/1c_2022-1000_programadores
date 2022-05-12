package com.milprogramadores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {

	/*
	Crear un fichero de texto con el nombre y contenido que tú desees. Por
	ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el fichero
	<<Ejercicio1.txt>> carácter a carácter y muestre su contenido por pantalla sin
	espacios.
	*/
	public static void main(String[] args) {
		
		String textoAEscribir = "Hola que haces";
		
		// creamos el archivo 
		File archivo = crearArchivo("./src/resources/", "archivo.txt");
		
		// escribo el archivo que cree
		escribir(archivo, textoAEscribir);

		// leer archivo sin espacios
		leerSinEspacios(archivo);
		
	}

	public static File crearArchivo(String path, String nombre){
		File nuevoArchivo = new File(path, nombre);
		try {
			if(!nuevoArchivo.exists()) {
				nuevoArchivo.createNewFile();				
			}
			return nuevoArchivo;
		}catch(IOException e) {
			System.out.println("Hubo un error, " + e.getLocalizedMessage());
			return null;
		}
	}
	
	public static void escribir(File archivoAEscribir, String texto) {
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			fileWriter = new FileWriter(archivoAEscribir); 
			buffer = new BufferedWriter(fileWriter);
			buffer.write(texto);
			buffer.flush();
		}catch(IOException e) {
			System.out.println("No se pudo escribir el archivo, " + e.getLocalizedMessage());
		}finally {
			try {
				fileWriter.close();
				buffer.close();				
			}catch(IOException e) { }
		}
		
	}
	
	public static void leerSinEspacios(File archivo) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(archivo);
			if(fr.ready()) {
				
				int caracterLeido;
				while( (caracterLeido = fr.read()) > -1 ) {
					if( caracterLeido != 32) {
						System.out.print((char) caracterLeido);						
					}
				}
			}
			fr.close();
		}catch(IOException e) {
			System.out.println("No se pudo leer el archivo.");
		}
	}
	
}
