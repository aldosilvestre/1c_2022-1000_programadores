package com.milprogramadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class LeerArchivo {

	public static void main(String[] args) throws IOException{
		
		FileReader fileReader = new FileReader("./src/resources/archivo_prueba.txt");
		
//		int c;
//		
//		while((c = fileReader.read()) > -1 ) {
//			System.out.print((char) c);			
//		}
		
		BufferedReader bufferReader = new BufferedReader(fileReader);

		
		String texto ;
		while((texto = bufferReader.readLine()) != null) {
			System.out.println(texto);			
		}
		
		bufferReader.close();
		fileReader.close();
		
		RandomAccessFile fileWriter = new RandomAccessFile("./src/resources/archivo_prueba.txt", "rw");
		
		fileWriter.seek(fileWriter.length());
		fileWriter.writeBytes("\nasdfjaskdjf");
		fileWriter.close();
	}

}
