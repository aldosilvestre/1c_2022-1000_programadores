package com.milprogramadores;

import com.milprogramadores.models.CajaDeAhorro;
import com.milprogramadores.models.Cliente;
import com.milprogramadores.models.CuentaCorriente;

public class Test {

    /**
     * Desde el sector de contabilidad por una normativa del BCRA se esta pidiendo que se obtenga el valor total que los clientes 
     * poseen en sus cajas de ahorro como en sus cuentas corrientes, para determinar si deben o no pagar el impuesto a los bienes personales. 
     *
     * Se deben tomar el valor de sus cuentas con moneda extranjera al valor del dolar oficial. 
     * 
     * Si el valor del cliente supera la suma de 10000000 pesos se debe informar que el mismo pagará bienes personales.
     * 
     * CONSIDERACIONES
     * Valor dolar oficial: 121 ARS
     * Se da el diagrama de clases del modelos de datos.
     */

    public static void main(String[] args) throws Exception {

        // El cliente debe tener un constructor con el id, nombre, apellido, dni
        Cliente cliente1 = new Cliente(Long.valueOf(1), "Alberto", "Sarasa", 20255856);

        // La cuenta de caja de ahorro se crea con el numero de cuenta, cbu y si es en dolares o no 
        CajaDeAhorro cdaClienteDolares = new CajaDeAhorro(Long.valueOf(123), "2154658732587466251133", true);
        cdaClienteDolares.setMonto(25000.00);
        
        CajaDeAhorro cdaClientePesos = new CajaDeAhorro(Long.valueOf(124), "2154658732587466251134", false);
        cdaClientePesos.setMonto(200000.00);
        
        CuentaCorriente ccClienteDolares = new CuentaCorriente(Long.valueOf(125), "2154658732587466251135", true);
        ccClienteDolares.setMonto(10000.23);

        CuentaCorriente ccClientePesos = new CuentaCorriente(Long.valueOf(125), "2154658732587466251136", false);
        ccClientePesos.setMonto(250000.05);

        cliente1.getCuentas().add(cdaClienteDolares);
        cliente1.getCuentas().add(cdaClientePesos);
        cliente1.getCuentas().add(ccClienteDolares);
        cliente1.getCuentas().add(ccClientePesos);

        if(cliente1.pagarBienes()){
            System.out.println("Paga bienes personales");
        }else{
            System.out.println("No paga bienes personales");
        }

    }
}
