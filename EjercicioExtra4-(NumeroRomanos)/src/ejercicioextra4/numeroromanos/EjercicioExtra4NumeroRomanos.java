package ejercicioextra4.numeroromanos;

import java.util.Scanner;

public class EjercicioExtra4NumeroRomanos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        System.out.println("----------NUMEROS ROMANOS--------------");
        if (numero < 11) {
            switch (numero) {
                case 1:
                    System.out.println(numero + "= I ");
                    break;
                case 2:
                    System.out.println(numero + "= II ");
                    break;
                case 3:
                    System.out.println(numero + "= III ");
                    break;
                case 4:
                    System.out.println(numero + "= IV ");
                    break;
                case 5:
                    System.out.println(numero + "= V ");
                    break;
                case 6:
                    System.out.println(numero + "= VI ");
                    break;
                case 7:
                    System.out.println(numero + "= VII ");
                    break;
                case 8:
                    System.out.println(numero + "= VIII ");
                    break;
                case 9:
                    System.out.println(numero + "= IX ");
                    break;
                case 10:
                    System.out.println(numero + "= X ");
                    break;
                default:
                    System.out.println("El numero ingresado es mayor a 10. Su numero es: " + numero);
            }
        } else {
            System.out.println("El numero ingresado es mayor a 10. Su numero es: " + numero);
        }
    }
}