package B2;

import java.util.Scanner;

public class main {
    public static void main(String [ ] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();

          System.out.print("ingrese su edad: ");
        int edad = scanner.nextInt();

       System.out.print("Hola, " + nombre + " Tienes " + edad +" años.");

        scanner.close();


        double altura= 1.63;

       System.out.printf("Nombre: %s, Edad:%d, Altura: %.2f%n" , nombre, edad, altura);





    }
}
