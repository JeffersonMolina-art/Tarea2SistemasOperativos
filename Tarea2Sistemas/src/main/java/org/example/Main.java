package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String name;

        System.out.println("cual es tu nombre");
        name =  d.nextLine();
        System.out.println("cual es tu edad");
        int edad =  d.nextInt();
        if(edad >= 18){
            System.out.println("Hola "+ name + "cuentas con la edad de "+edad + "eres mayor de edad");
        }else{
            System.out.println("Hola "+ name + "cuentas con la edad de "+edad + "eres menor de edad");
        }

    }
}