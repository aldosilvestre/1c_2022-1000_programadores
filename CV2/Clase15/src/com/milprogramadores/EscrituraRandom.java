package com.milprogramadores;

import java.io.IOException;
import java.io.RandomAccessFile;

public class EscrituraRandom {

	public static void main(String[] args) throws IOException{

		RandomAccessFile raf = new RandomAccessFile("./src/resources/archivo_prueba.txt", "rw");
		
		raf.seek(raf.length());
		
		raf.writeBytes("\nholaDeNuevo");
		
		raf.close();
	}
	

}
