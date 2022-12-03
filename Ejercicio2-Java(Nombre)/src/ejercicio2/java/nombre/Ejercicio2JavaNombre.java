package ejercicio2.java.nombre;

import java.util.Scanner;

public class Ejercicio2JavaNombre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();
        System.out.println("El nombre ingresado es: " + nombre);
    }
}