package ejercicio3.java.mayusculaminuscula;

import java.util.Scanner;

public class Ejercicio3JavaMayusculaMinuscula {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println("La frase ingresada en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase ingresada en minuscula es: " + frase.toLowerCase());
    }
}