package com.teaching.android;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        //New Persona("Messi,100f) nombre y dinero tienen que salir automatico, NO ESCRIBIRLO)
        Persona p1 = new Persona ("Messi", 100f);
        Persona p2 = new Persona("Ronaldo", 500f);
        System.out.println("Ronaldo tiene " + p2.getDinero());
        System.out.println("Messi tiene " + p1.getDinero());
        p1.pagar (p2, 35f);
        System.out.println("Ronaldo se queda con " + p2.getDinero());
        System.out.println("Messi se queda con " + p1.getDinero());
        Persona p3 = new Persona("Sergio", 643f);
        System.out.println(p3.getNombre() + " jamas ha tenido " + p3.getDinero()+"€");
    }

}