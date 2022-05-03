package com.milprogramadores.modulo_1_tp_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    

    public static void main(String[] args) {
        
        /*
         * Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de digitos pares
         * 
         * Ejemplo1: numero 63 --> el 6 es par y el 3 es impar ==> solo tiene un digito par
         * Ejemplo2: numero 236 --> el 2 es par, el 3 es impar y el 6 es par ==> tiene 2 digitos que son pares
         */

        Scanner scn = new Scanner(System.in);

        Random rnd = new Random();

        System.out.print("Ingrese la cantidad de numeros de la lista random: ");
        int cantNumeros = scn.nextInt();

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=0; i< cantNumeros; i++){
            lista.add(rnd.nextInt(1000));
        }
        

        System.out.println("La lista de numeros aleatorios es: " + lista);

        // Creo un lista auxiliar para guardar los numeros que cumplen la condicion.
        ArrayList<Integer> listaPares = new ArrayList<>();

        for( Integer numero : lista){

            // voy a utilizar un auxiliar para mantener el numero original.
            int aux = numero;
            
            // utilizo un contador para saber el numero de digitos pares.
            int count = 0;
    
            while(aux != 0){
                // Me fijo si el digito mas a la derecha es par, si lo es sumo el contador. 
                if( aux % 2 == 0){ // --> 1 o 0
                    count++;
                }
                // Divido el auxiliar por 10 para pasar al siguiente digito de la izquierda --> 165 pasaria a ser 16; 
                aux /= 10;
            }

            if(count % 2 == 0){
                listaPares.add(numero);
            }

        }

        // Aqui se imprime la lista de elementos que cumplio la condicion.
        System.out.println("Los numeros que cumplen la condicion son: " + listaPares);


        scn.close();
    }

}
