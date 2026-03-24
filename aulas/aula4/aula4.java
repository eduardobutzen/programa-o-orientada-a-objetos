package aula4;

public class aula4 {
    
    public static void main(String[] args) {
        
        try {

            int [] numeros = {1, 2, 3};
            System.out.print(numeros[3]);

            }catch (Exception e ) {

                System.out.println("Exceção: " +e.toString());

            }

    }

}

