package ejercicio14.java.conversioneuros;

import java.util.Scanner;

public class Ejercicio14JavaConversionEuros {

    public static String Convertir(double num) {
        double yenesC = 129.852 * num;
        double dolaresC = 1.28611 * num;
        double librasC = 0.86 * num;
        String texto = "------CONVERSION-----" + "\n" + "Sus " + num + " Euros ingresados son: " + String.valueOf(yenesC) + " yenes " + "\n"
                + "Sus " + num + " Euros ingresados son: " + String.valueOf(dolaresC) + " dolares " + "\n"
                + "Sus " + num + " Euros ingresados son: " + String.valueOf(librasC) + " libras ";
        return texto;
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        System.out.println("Ingrese un numero");
        num = leer.nextDouble();
        System.out.println(Convertir(num));
    }
}
