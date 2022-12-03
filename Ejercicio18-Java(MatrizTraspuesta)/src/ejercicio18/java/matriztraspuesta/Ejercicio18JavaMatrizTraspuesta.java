package ejercicio18.java.matriztraspuesta;

import java.util.Random;

public class Ejercicio18JavaMatrizTraspuesta {

    public static void main(String[] args) {
        int i;
        int j;
        int[][] matriz = new int[4][4];
        Random r = new Random();
        System.out.println("-------- Matriz con numeros aleatorios ----------");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = r.nextInt(6) + 1;
            }
        }
        System.out.println("-------- Mostrar matriz ----------");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("-------- Mostrar matriz traspuesta ----------");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i]);
            }
            System.out.println(" ");
        }
    }
}