package com.teaching.android;

public class Matriz {
    public static final int DEF_SIZE = 3;

    private int[][] matriz;

    public Matriz(int size) { matriz = new int[size][size];
    }

    public void asignarDatos(int[] vector) {
        if (Math.sqrt(vector.length) == matriz.length) {
            int indice = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    //Asignar a la posición de la matriz
                    matriz[i][j] = vector[indice++];
                }
            }
        } else {
            System.out.println("No compatible");
//			throw new Exception("No compatible");
        }
    }public void suma(Matriz m){
        //Compruebo que la longitud es compatible
        if (m.matriz.length == this.matriz.length){
            for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz.length; j++){
                    //Sumar a la posición de la matriz
                    matriz[i][j] += m.matriz[i][j];
                }
            }
        }else{
            System.out.println("No compatible");
        }
    }

    public void producto(Matriz m){
        //Compruebo que la longitud es compatible
        if (m.matriz.length == this.matriz.length){
            for (int i=0; i<matriz.length; i++){
                for (int j=0; j<matriz.length; j++){
                    //Sumar a la posición de la matriz
                    matriz[i][j] *= m.matriz[i][j];
                }
            }
        }else{
            System.out.println("No compatible");
        }
    }

    public void mostrar(){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}