public class Ejercicio7 {
    public static void main(String[] args) {
int desde=99;
int hasta=7;

int contador1=0;
int contador2=0;
        for (int i=desde;i!=hasta;i++){
            if (desde!=hasta){
                if (i>99){
                    i=1;
                }
                contador1++;
            }
        }
        for (int j = hasta; j !=desde; j++){
            if (j>99){
                j=1;
            }
            if (hasta!=desde){
                contador2++;
            }
        }
        if (contador1<contador2){
            System.out.println(contador1);
        }else if (contador2<contador1){
            System.out.println(contador2);
}
        else {
            System.out.println(contador1);
        }
    }

    public static int canales(int desde, int hasta){
        int contador1=0;
        int contador2=0;
        for (int i=desde;i!=hasta;i++){
            if (desde!=hasta){
                if (i>99){
                    i=1;
                }
                contador1++;
            }
        }
        for (int j = hasta; j !=desde; j++){
            if (j>99){
                j=1;
            }
            if (hasta!=desde){
                contador2++;
            }
        }
        if (contador1<contador2){
            return (contador1);
        }else if (contador2<contador1){
            return (contador2);
        }
        else {
            return (contador1);
        }
    }
}
