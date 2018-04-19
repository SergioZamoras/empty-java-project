package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        Punto p1 = new Punto(2,4);
        Punto p2 = new Punto(3,5);
    double distancia = p1.distancia(3,5);
    System.out.println(distancia);
    double distancia2 = p1.distancia(p2);
    System.out.println(distancia2);
    System.out.println(p1);
    }
}