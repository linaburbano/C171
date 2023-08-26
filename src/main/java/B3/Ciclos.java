package B3;

public class Ciclos {

    public static void main(String[] args) {

        boolean puedeSalir=true;
        while (puedeSalir) {
            for (int i = 0; i < 6; i++) {
                if (i==5){
                    puedeSalir=false;
                } else { System.out.println(i+1);

                }

            }


        }

        boolean puedeSalir2=true;
        do { for (int i = 0; i < 6; i++) {
            if (i==5){
                puedeSalir2=false;
            } else { System.out.println(i+1);

            }

        }

        }while (puedeSalir2);




    }



}
