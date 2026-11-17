public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {2, 3, 4, 5};
        boolean creciente = false;
        boolean decreciente = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            } else if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            }
        }
        if (!creciente && !decreciente) {
            System.out.println("Son iguales");
        } else if (creciente && decreciente) {
            System.out.println("Estan desordenados");
        } else if (creciente && !decreciente) {
            System.out.println("Es creciente");
        } else if (!creciente && decreciente) {
            System.out.println("Es decreciente");
        }
    }

    public static String orden(int[] numeros) {
        boolean creciente = false;
        boolean decreciente = false;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] < numeros[i + 1]) {
                creciente = true;
            } else if (numeros[i] > numeros[i + 1]) {
                decreciente = true;
            }
        }
        if (!creciente && !decreciente) {
            return ("Iguales");
        } else if (creciente && decreciente) {
            return ("Desordenado");
        } else if (creciente && !decreciente) {
            return ("Ascendente");
        } else if (!creciente && decreciente) {
            return ("Descendente");
        }
        return "";
    }

}



