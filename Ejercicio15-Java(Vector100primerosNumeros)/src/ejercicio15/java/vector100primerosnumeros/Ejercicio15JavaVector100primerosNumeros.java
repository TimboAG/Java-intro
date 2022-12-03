package ejercicio15.java.vector100primerosnumeros;

public class Ejercicio15JavaVector100primerosNumeros {

    public static void main(String[] args) {
        int[] vector = new int[101];
        int i;
        for (i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        for (i = vector.length - 1; i > 0; i--) {
            System.out.println(vector[i]);
        }
    }

}