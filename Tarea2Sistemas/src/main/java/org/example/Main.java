package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        String name;

        System.out.println("cual es tu nombre");
        name =  d.nextLine();
        System.out.println("Hola"+ name + " como te encuentras hoy!");
    }
}