import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digitos = "3433";
        int sumanumero = 0;
        System.out.println(sumaDigitos(digitos));

    }

    public static String sumaDigitos(String digitos) {
        int sumanumero = 0; String resultado = "";

        for (int i = 0; i < digitos.length(); i++) {
            sumanumero += Character.getNumericValue(digitos.charAt(i));
            if (i == digitos.length() - 1) {
                resultado += digitos.charAt(i) + " = " + sumanumero;

            } else {
                resultado += digitos.charAt(i) + " + ";
            }
        }
        return resultado;

    }

}
