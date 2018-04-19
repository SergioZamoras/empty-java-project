package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;

    public Circulo(){

    }
    public Circulo(int pX, int pY, int pRadio){
        this.radio = pRadio;
        this.centro = new Punto(pX, pY);
    }
    public  Circulo(Punto p, int pRadio){
        radio = pRadio;
        centro = p;

    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                '}';
    }
}
