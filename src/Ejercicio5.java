import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = {5, 7, 4, 3, 1};
        System.out.println(mediana(numeros));

    }

    public static double mediana(int numeros[]) {
        double mediana;

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        if (numeros.length % 2 == 0) {
            double n = numeros[numeros.length / 2];
            double m = numeros[(numeros.length / 2 ) - 1 ];
            mediana = (n + m)/ 2;
        } else {
            mediana = numeros[numeros.length / 2];
        }
        return mediana;
    }

}

