package ejercicio6.java.par.impar;

import java.util.Scanner;

public class Ejercicio6JavaParImpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par");
        } else {
            System.out.println("El numero ingresado no es par");
        }
    }

}