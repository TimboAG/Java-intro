package ejercicioextra11.cantidaddigitosdivision;

import java.util.Scanner;

public class EjercicioExtra11CantidadDigitosDivision {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n, cifras;
        System.out.println("Introduce un número entero (hasta 10 cifras): ");
        n = leer.nextInt();
        cifras = 0;
        while (n != 0) {
            n = n / 10;
            cifras++;
        }
        System.out.println("El número tiene " + cifras + " cifras");
    }
}