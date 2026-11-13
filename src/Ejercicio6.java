public class Ejercicio6 {
    public static void main(String[] args) {
        int num =22856;



        if (esHyperpar(num)) {
            System.out.println("Sí lo es");
        }else {
            System.out.println("No lo es");
        }
    }
    public static boolean esHyperpar(int num) {

        String numero =Integer.toString(num);
        for (int i = numero.length() - 1; i >= 0; i--) {
            if ((numero.charAt(i) % 2 != 0) ) {
                return false;
            }
        }
        return true;
    }

}
