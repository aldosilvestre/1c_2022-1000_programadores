package com.milprogramadores;

public class Matrices {

	public static void main(String[] args) {
		// int[nroFilas][nroColumnas]
		int[][] matriz = new int[3][3];
		
		// (0,0) (0,1) (0,2)
		// (1,0) (1,1) (1,2)
		// (2,0) (2,1) (2,2)
		matriz[2][2] = 5;
		matriz[0][2] = 11;
		
		System.out.println(matriz[2][2]);
		System.out.println(matriz[0][2]);
		System.out.println(matriz[0][0]);
		
		for(int fila=0; fila < 3; fila++) {
			for(int column=0; column< 3; column++) {
				System.out.print(matriz[fila][column] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
