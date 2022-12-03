package ejercicio9.java.primeraletraa;

import java.util.Scanner;

public class Ejercicio9JavaPrimeraLetraA {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.substring(0, 1).equals("A") || frase.substring(0, 1).equals("a")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}