package ejercicioextra2.valores.distintos;

public class EjercicioExtra2ValoresDistintos {

    public static void main(String[] args) {
        int a, b, c, d;
        int aux;
        a = 2;
        b = 4;
        c = 7;
        d = 10;
        System.out.println("----------VALORES-------------- ");
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);
        System.out.println("El valor de d es: " + d);
        System.out.println("----------CAMBIO DE VALORES-------------- ");
        aux = b;
        b = c;
        System.out.println("El valor de b ahora es el valor de c: " + b);
        b = aux;
        aux = d;
        d = b;
        System.out.println("El valor de d ahora es el valor de b: " + d);
        d = aux;
        aux = c;
        c = a;
        System.out.println("El valor de c ahora es el valor de a: " + c);
        aux = a;
        a = d;
        System.out.println("El valor de a ahora es el valor de d: " + a);
    }
}