import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 2, 2, 5, 3, 2, 1, 4, 12, 5, 5};
        int contador = 1;
        int maximoNumero = 0;
        int maxContador = 0;

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length - 1; i++) {
            contador = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                    if (contador > maxContador) {
                        maximoNumero = numeros[i];
                        maxContador = contador;
                    }
                }
            }
        }
        System.out.println(maximoNumero);

    }
    public static int moda(int[] numeros) {
        int contador = 1;
        int maximoNumero = 0;
        int maxContador = 0;

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        for (int i = 0; i < numeros.length - 1; i++) {
            contador = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                    if (contador > maxContador ) {
                        maximoNumero = numeros[i];
                        maxContador = contador;
                    }
                }
            }
        }
        return maximoNumero;
    }

}
