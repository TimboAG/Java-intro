package ejercicioextra3.esvocal;

import java.util.Scanner;

public class EjercicioExtra3EsVocal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String letra;
        System.out.println("Ingrese una letra");
        letra = leer.next();
        if (letra.length() == 1) {
            switch (letra) {
                case "a":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "e":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "E":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "i":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "I":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "o":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "O":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "u":
                    System.out.println("Es una vocal. " + letra);
                    break;
                case "U":
                    System.out.println("Es una vocal. " + letra);
                    break;
                default:
                    System.out.println("La letra ingresada no es una vocal: " + letra);
            }
        } else {
            System.out.println("Se ingreso mas de una letra: " + letra);
        }
    }
}