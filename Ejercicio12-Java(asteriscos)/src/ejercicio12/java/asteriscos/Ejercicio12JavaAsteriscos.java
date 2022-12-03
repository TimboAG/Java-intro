package ejercicio12.java.asteriscos;

import java.util.Scanner;

public class Ejercicio12JavaAsteriscos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        int j;
        int num;
        System.out.println("Ingrese un numero");
        num = leer.nextInt();
        for (i = 0; i < num; i++) {
            for (j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
