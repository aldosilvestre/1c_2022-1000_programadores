package com.milprogramadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {

	/*
	Crear un fichero de texto con el nombre y contenido que tú desees. 
	Por ejemplo, Ejercicio1.txt. Realiza un programa en Java que lea el 
	fichero <<Ejercicio1.txt>> carácter a carácter y muestre su contenido 
	por pantalla  sin espacios.

	Ejemplo:
	Si el fichero contiene el siguiente texto “Hola que haces”, deberá 
	mostrar “Holaquehaces”.sugerencia: usar la función ready() de 
	BufferedReader (implementarla para saber lo que hace)
	*/
	
	public static void main(String[] args) {
		
		String informacionAEscribir = "Hola que haces ";
		
		// Creamos el archivo
		File archivo = crearArchivo("./src/resources/", "archivo.txt");
		
		// Escribir el archivo creado
		escribir(archivo, informacionAEscribir);
		
		// Leer el archivo sin espacios
		leerSinEspacios(archivo);
		
	}

	public static File crearArchivo(String pathPadre, String nombreArchivo) {
		File nuevoArchivo = new File(pathPadre, nombreArchivo);
		try {
			if(!nuevoArchivo.exists()) {
				nuevoArchivo.createNewFile();				
			}
			return nuevoArchivo;
		}catch(IOException e) {
			System.out.println("No se pudo crear el archivo, " + e.getLocalizedMessage());
			return null;
		}
	}
	
	public static void escribir(File archivo, String info) {
		FileWriter fw = null;
		BufferedWriter buffer = null;
		try {
			fw = new FileWriter(archivo);
			buffer = new BufferedWriter(fw);
			buffer.write(info);
			buffer.flush();
		}catch(IOException e) {
			System.out.println("No se puedo escribir el archivo, " + e.getLocalizedMessage());
		}finally {
			try {
				fw.close();
				buffer.close();				
			}catch(IOException e) {}
		}
	}
	
	public static void leerSinEspacios(File file) {
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			if(fr.ready()) {
				int caracter;
				while( (caracter = fr.read()) > -1 ) {
					if(caracter != 32) {
						System.out.print((char) caracter);						
					}
				}
			}
		}catch(IOException e) {
			System.out.println("Hubo un error al leer el archivo, " + e.getLocalizedMessage());
		}
		
		
	}
	
}
