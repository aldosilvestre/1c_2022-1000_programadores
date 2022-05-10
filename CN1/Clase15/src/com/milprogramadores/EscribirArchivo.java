package com.milprogramadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

	public static void main(String[] args) throws IOException{
		
		FileWriter fileWriter = new FileWriter("./src/resources/archivo_prueba.txt");
		
		/*
		 * fileWriter.write("Hola"); 
		 * fileWriter.append('\n'); 
		 * fileWriter.write("mundo");
		 * 
		 * fileWriter.flush();
		 * 
		 * fileWriter.close();
		 */
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.append("adios");
		bufferedWriter.newLine();
		bufferedWriter.append("chau");
		
		bufferedWriter.flush();
		bufferedWriter.close();
		
	}

}
