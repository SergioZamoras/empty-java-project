package com.teaching.android;

public class Punto {
    private int x;
    private int y;

    public Punto() {

    }
public Punto(int pX, int pY){
        pX = x;
        pY = y;
}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distancia(int pX, int pY){
        int diferenciaX = pX - x;
        int diferenciaY = pY - y;
        double diferenciaXElevado = Math.pow(diferenciaX,2);
        double diferenciaYElevado = Math.pow(diferenciaY,2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;
    }
    public double distancia(Punto p){
        int diferenciaX = p.x - x;
        int diferenciaY = p.y - y;
        double diferenciaXElevado = Math.pow(diferenciaX,2);
        double diferenciaYElevado = Math.pow(diferenciaY,2);
        double suma = diferenciaXElevado + diferenciaYElevado;
        double resultado = Math.sqrt(suma);

        return resultado;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
