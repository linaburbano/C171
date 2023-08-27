package B4;
import B4.DatosFormulario;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TrabajoEnClaseB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger(TrabajoEnClaseB4.class.getName());

        DatosFormulario estudiante = new DatosFormulario();

        try {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();

            System.out.print("Promedio de notas: ");
            Double promedioNotas = Double.parseDouble(scanner.nextLine());

            System.out.print("Carrera a cursar: ");
            String carrera = scanner.nextLine();


            if ( promedioNotas < 3.0) {
                System.out.println("El estudiante no fue aprobado.");
            }
            {
                System.out.println("El estudiante fue aprobado en la universidad.");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Hubo un error en el formulario de registro.", e);
            System.out.println("Hubo un error en el registro. Por favor intenta nuevamente.");
        }
    }
}


