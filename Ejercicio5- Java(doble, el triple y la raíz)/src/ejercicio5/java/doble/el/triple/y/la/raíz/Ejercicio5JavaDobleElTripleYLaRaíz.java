package ejercicio5.java.doble.el.triple.y.la.raíz;

import java.util.Scanner;

public class Ejercicio5JavaDobleElTripleYLaRaíz {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero;
        double doble;
        double triple;
        double raiz;
        System.out.println("Ingrese un numero");
        numero = leer.nextDouble();
        doble = 2 * numero;
        triple = 3 * numero;
        raiz = Math.sqrt(numero);
        System.out.println("El doble del numero ingresado es: " + doble);
        System.out.println("El triple del numero ingresado es: " + triple);
        System.out.println("La raiz cuadrada del numero ingresado es: " + raiz);
    }

}