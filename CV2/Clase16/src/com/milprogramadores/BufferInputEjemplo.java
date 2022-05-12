package com.milprogramadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferInputEjemplo {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader buffer = new BufferedReader(isr);
		
		String cadena = buffer.readLine();
		System.out.println(cadena);
		
	}

}
