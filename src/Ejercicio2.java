public class Ejercicio2 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int mes = 9;
        int dia = 15;

        System.out.println(diasHastaNochevieja(dia, mes));
    }
    public static int diasHastaNochevieja(int dia, int mes){
        int[] diasMese = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int resultado = diasMese[mes - 1] - dia;
        for (int i = mes; i < 12; i++) {
            resultado += diasMese[i];
        }
        return resultado;
    }
}
