package ejercicio1.java.suma;

import java.util.Scanner;

public class Ejercicio1JavaSuma {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de los dos numeros ingresados es: " + suma);
    }

}
