package ejercicio7.java.equals;

import java.util.Scanner;

public class Ejercicio7JavaEquals {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        if (frase.equals("eureka") == true) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}