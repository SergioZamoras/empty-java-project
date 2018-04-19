package com.teaching.android;

public class Persona {
    //ATRIBUTOS
    private String nombre;
    private float dinero;

    public Persona (String nombre, float dinero){
        this.nombre = nombre;
        this.dinero = dinero;
    }
    public void pagar(Persona p, float cantidad){
        this.dinero = dinero + cantidad;
        p.dinero = p.dinero - cantidad;
        System.out.println(p.nombre + " ha pagado a " + this.nombre + " " + cantidad + "€");
    }

    public String getNombre() {
        return nombre;
    }

    public float getDinero() {
        return dinero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
