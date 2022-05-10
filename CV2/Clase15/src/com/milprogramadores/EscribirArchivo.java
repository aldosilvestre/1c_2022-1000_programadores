package com.milprogramadores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("./src/resources/archivo_prueba.txt");
		
//		fw.append('a');
//		fw.write("asdfasdf");
//		fw.write("\n");
//		fw.write("Hola mundo");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hola");
		bw.newLine();
		bw.write("mundo");
		
		bw.flush();
		
		bw.close();
		fw.close();
	}

}
