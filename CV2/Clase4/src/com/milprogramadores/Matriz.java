package com.milprogramadores;

import java.util.ArrayList;

public class Matriz {

	public static void main(String[] args) {
		
		int filas = 5;
		int columnas = 5;
		
		int[][] matriz = new int[filas][columnas];
		
		matriz[0][1] = 54;
		matriz[2][1] = 25;
		matriz[4][3] = 44;
		
		/* lo que tiene
		 * 0 54  0  0  0
		 * 0  0  0  0  0
		 * 0 25  0  0  0
		 * 0  0  0  0  0
		 * 0  0  0 44  0
		 * 
		 * Indices
		 * (0,0) (0,1) (0,2) (0,3) (0,4)
		 * (1,0) (1,1) (1,2) (1,3) (1,4)
		 * (2,0) (2,1) (2,2) (2,3) (2,4)
		 * (3,0) (3,1) (3,2) (3,3) (3,4)
		 * (4,0) (4,1) (4,2) (4,3) (4,4)
		 */
		
		for(int fila = 0; fila < filas; fila++) {
			for(int columna = 0; columna < columnas; columna++) {
				System.out.print(matriz[fila][columna] + "\t" );
			}
			System.out.println();
		}
		
		ArrayList<ArrayList<Integer>> matrizArray = null;
		
		matrizArray.get(1).remove(3);
		
		// ArrayList<Estudiantes> estudiantes;
		// ArrayList<Nota> notas;
		// Estudiante.notas == new ArrayList<Nota>();
		
	}

}
