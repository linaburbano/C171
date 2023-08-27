package B2;

import B4.DatosFormulario;

import java.util.Scanner;

public class TrabajoEnClaseB2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Estudiante estudiante = new Estudiante();

        System.out.print("ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("ingrese su edad: ");
        String edad = scanner.nextLine();
        System.out.print("ingrese su genero: ");
        String genero = scanner.nextLine();


        scanner.close();


        double altura= 1.63;

        System.out.printf("Nombre: %s, Edad:%d, Altura: %.2f%n" , nombre, edad, altura);




    }
}




