package B3;

public class TrabajoEnClaseB3 {

    public static void main(String[] args) {

        //Invertir el orden de los numeros dados

        int [ ] numeros = { 3, 0, -1, 2, 4};
        System.out.println ("Estos son los numeros en orden original" );

        for (int i = 0; i < numeros.length ; i++ ) {
            System.out.print (numeros [i] +" " );
        }

        System.out.println (" \nEstos son los numeros en orden invertido" );

        for (int i = numeros.length -1; i>= 0; i --) {

            System.out.print (numeros [i] +" " );
        }


            










    }

}
