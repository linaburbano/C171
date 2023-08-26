package B1;

import java.util.Scanner;

public class TrabajoEnClaseB1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("ingrese tres numeros: ");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 ){

            System.out.print( numero1 + " es el mayor ");

          } else if (numero1>numero3) {
            System.out.print( numero1 + " es el mayor ");

        }
        else if (numero2>numero1) {
            System.out.print( numero2 + " es el mayor ");


        }

        else if (numero2>=numero3) {
            System.out.print( numero2 + " es el mayor ");

        } else if (numero3>numero1)
         {
            System.out.print( numero3 + " es el mayor ");

        }
    }


}
