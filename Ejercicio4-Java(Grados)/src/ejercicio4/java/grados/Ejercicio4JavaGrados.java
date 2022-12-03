package ejercicio4.java.grados;

import java.util.Scanner;

public class Ejercicio4JavaGrados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double grados;
        double conversion;
        System.out.println("Ingrese ell grado que desea convertir");
        grados = leer.nextDouble();
        conversion = 32 + (9 * grados / 5);
        System.out.println("Los grados ingresados convertidos en Fahrenheit es: " + conversion);
    }
}