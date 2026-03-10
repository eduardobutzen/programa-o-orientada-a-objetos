package aula2;

import java.util.Scanner;

public class aula2 {

    public static void main(String[] args) {
        
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número inteiro");
            int n = teclado.nextInt();
            System.out.println("Digite um número decimal");
            double n1 = teclado.nextDouble();
            System.out.println("int digitado: " + n);
            System.out.println("double digitado: " + n1);
            teclado.nextLine(); // Limpa o buffer do teclado
            System.out.println("Digite uma palavra");
            String palavra = teclado.next();
            System.out.println("String digitada: " + palavra);
            palavra = teclado.nextLine();
            System.out.println("String digitada com nextLine: " + palavra);
            teclado.close();

            for(int i = 0; i < 10; i++) {

                //I apenas vai existir aqui dentro
                System.out.println("i vale: " + i);

            }

            int i = 0; //inicializar a variável fora do laço para poder usar depois do laço

            while (i <10) {

                System.out.println("i vale: " + i);
                i++;
                
            }

    }

}