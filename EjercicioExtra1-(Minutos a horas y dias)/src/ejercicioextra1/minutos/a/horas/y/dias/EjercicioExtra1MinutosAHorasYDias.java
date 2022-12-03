package ejercicioextra1.minutos.a.horas.y.dias;

import java.util.*;

public class EjercicioExtra1MinutosAHorasYDias {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int minutos;
        int horas;
        int dias;
        int horasAux;
        System.out.println("Ingrese minutos:");
        minutos = leer.nextInt();
        dias = minutos / 1440;
        horas = minutos / 60;
        horasAux = horas - 24;
        while (horasAux > 24) {
            horasAux = horasAux - 24;
        }
        System.out.println("El equivalente de los minutos ingresados en dias y horas es: " + dias + " dias " + horasAux + " horas");
    }

}