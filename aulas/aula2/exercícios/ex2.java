package aula2.exercícios;

import java.util.Scanner;

//calcular fatorial de um número inteiro positivo

public class ex2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.err.println("Digite um número inteiro positivo");
        int n = teclado.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= n; i++) {

            fatorial = fatorial * i;
            
        }

      System.out.println("O fatorial de " + n + " é: " + fatorial);

      teclado.close();
     
    }

}