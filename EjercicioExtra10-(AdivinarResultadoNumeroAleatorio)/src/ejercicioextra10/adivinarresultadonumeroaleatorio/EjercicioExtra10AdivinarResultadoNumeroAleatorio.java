package ejercicioextra10.adivinarresultadonumeroaleatorio;

import java.util.Scanner;

public class EjercicioExtra10AdivinarResultadoNumeroAleatorio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int aux, suma, numAleatorio, total;
        numAleatorio = (int) (Math.random() * 10);
        aux = numAleatorio;
        System.out.println("Primer numero: " + numAleatorio);
        numAleatorio = (int) (Math.random() * 10);
        System.out.println("Segundo numero: " + numAleatorio);
        System.out.println("-----------¿CUAL ES LA SUMA?-----------");
        suma = aux + numAleatorio;
        do {
            System.out.println("Ingrese el valor de la suma:");
            total = leer.nextInt();
            if (total == suma) {
                System.out.println("La suma ingresada es correcto");
            } else {
                System.out.println("La suma ingresada no es correcto, vuelva a intentarlo");
            }
        } while (total != suma);
    }
}