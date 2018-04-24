package com.teaching.android;

public class Coche {
    private int plazas;
    private boolean extras = false;

    public Coche(int plazas, boolean extras) {
        this.plazas = plazas;
        this.extras = extras;
    }

    public void plazas() {
        int.plazas();

    }
    public String toString() {
        return "Plazas" + plazas + "extras" + extras;
    }
}
