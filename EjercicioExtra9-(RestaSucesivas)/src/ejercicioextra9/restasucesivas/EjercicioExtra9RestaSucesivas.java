package ejercicioextra9.restasucesivas;

import java.util.Scanner;

public class EjercicioExtra9RestaSucesivas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dividendo, divisor, cociente;
        System.out.println("Ingrese dividendo");
        dividendo = leer.nextInt();
        System.out.println("Ingrese divisor");
        divisor = leer.nextInt();
        cociente = 0;
        while (dividendo >= divisor) {
            dividendo = dividendo - divisor;
            cociente++;
        }
        System.out.println("---------RESULTADO---------");
        System.out.println("Residuo: " + dividendo);
        System.out.println("Cociente: " + cociente);
    }
}