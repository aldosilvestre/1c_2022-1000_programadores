package com.milprogramadores;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        
        List<Integer> listaEnterosInmutable = List.of(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));

        //listaEnterosInmutable.set(2, 50);

        List<Integer> listaEnterosMutable = new ArrayList<Integer>();
        listaEnterosMutable.add(Integer.valueOf(2));
        listaEnterosMutable.add(Integer.valueOf(3));
        listaEnterosMutable.add(Integer.valueOf(1));

        listaEnterosMutable.set(2, Integer.valueOf(50));

        System.out.println(listaEnterosInmutable);

        // Lista Inmutable --> No cambia, siempre es la misma.
        // Lista Mutable --> Todo lo contrario.


        int array[] = new int[3];

        for(int val : array){
            System.out.println(val);
        }






    }
}
