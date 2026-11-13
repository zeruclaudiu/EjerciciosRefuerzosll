public class Ejercicio10 {
    public static void main(String[] args) {
        int compartimento = 5;
        int capacidad = 300;
        int diferencia = 10;
        int litrosTotal = 0;
        for (int i = 1; i <= compartimento; i++) {
            litrosTotal += capacidad;
            capacidad -= diferencia;

        }
        System.out.println("La capacidad es: " + litrosTotal);
    }
    public static int litros(int compartimento, int capacidad, int diferencia) {
        int litrosTotal = 0;
        for (int i = 1; i <= compartimento; i++) {
            litrosTotal += capacidad;
            capacidad -= diferencia;

        }
        return litrosTotal;
    }

}
