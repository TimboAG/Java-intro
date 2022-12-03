package ejercicioextra5.tipossocios;

import java.util.Scanner;

public class EjercicioExtra5TiposSocios {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double suma;
        double suma2;
        double importe;
        String socio;
        System.out.println("Ingrese tipo de socio: A, B o C");
        socio = leer.next();
        System.out.println("Ingrese un importe");
        importe = leer.nextDouble();
        switch (socio.toUpperCase()) {
            case "A":
                suma = (importe * 0.5);
                System.out.println("Su monto total, con un 50% de descuento es= $" + suma);
                break;            
            case "B":
                suma = (importe * 0.35);
                suma2 = importe - suma;
                System.out.println("Su monto total, con un 50% de descuento es= $" + suma2);
                break; 
            case "C":
                System.out.println("Su monto total, es= $" + importe);
                break;
            default:
                System.out.println("Tipo de socio ingresado no valido");
        }
    }
}
