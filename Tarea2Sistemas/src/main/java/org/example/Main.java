package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String name;

        System.out.println("Cual es tu nombre");
        name =  d.nextLine();
        System.out.println("Cual es tu edad");
        int edad =  d.nextInt();
        if(edad >= 18){
            System.out.println("Realiza tu pedido de comida");
            String pedido = d.nextLine();
            System.out.println("Hola "+ name + " cuentas con la edad de "+edad + "eres mayor de edad"+" Tu pedido de: "+pedido+ " estara listo en breve");
        }else{
            System.out.println("Hola "+ name + " cuentas con la edad de "+edad + " eres menor de edad no puedes ordenar comida");
        }
        System.out.println("");

    }
}