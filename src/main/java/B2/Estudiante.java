package B2;

public class Estudiante {
    public static void main(String[] args) {

    }


        class TrabajoEnClaseB2 {

            private String nombre;
            private char genero;
            private int edad;

            TrabajoEnClaseB2(String nombre,int edad){
                this.nombre= nombre ;
                this.edad= edad;
            }

            TrabajoEnClaseB2 (char genero ){
                this.genero= genero ;

            }

            public String getNombre() {
                return nombre;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }

            public char getGenero() {
                return genero;
            }

            public void setGenero(char genero) {
                this.genero = genero;
            }

            public int getEdad() {
                return edad;
            }

            public void setEdad(int edad) {
                this.edad = edad;
            }


        }

    }
