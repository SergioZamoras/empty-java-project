package com.teaching.android;

import java.util.Scanner;

public class OddGame {

    public static void main(String[] args) {
        System.out.print("Dime un número:");

        // Read the input value
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();
        System.out.println(10*5 + 100/10 - 5 + 7%2);
        // Determine if value is odd or even
        if (valor % 2 == 0) {
            System.out.println(valor + " es par.");
        } else {
            System.out.println(valor + " es impar.");
        }
    }

}
