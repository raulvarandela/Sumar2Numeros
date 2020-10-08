package com.rvmarra17.sumar2numeros.core;

public class sumar {
    public static int suma(int op1, int op2){
        return op1+op2;
    }
    public static int suma(String op1, String op2){
        int d1;
        int d2;
        try {
            d1 = Integer.parseInt(op1);
            d2 = Integer.parseInt(op2);
        }catch (NumberFormatException excepcion) {
            d1 = d2 = 0;
        }
        return suma(d1,d2);
    }

    }

