package B3;

public class SegundoTrabajoEnClaseB3 {

    public static void main(String[] args) {

        //encontrar los numeros primos del 1 hasta 1000 utilizando while o do while o for

        int num = 2;
        while (num <= 1000) {
            boolean esPrimo = true;
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
            num++;
        }
    }
}
