package aula2.exercícios;

import java.util.Scanner;

// Escreva um programa Java que use um laço para ler vários nomes de cidades dousuário até que o nome "São Paulo" seja lido

public class ex5 {

    public static void main(String[] args) {
        
        String cidade = "";
        Scanner teclado = new Scanner(System.in);

      if(cidade.equals("São Paulo")) {
        System.out.println("A cidade digitada é São Paulo. Encerrando o programa.");
      } else {
        while (!cidade.equals("São Paulo")) {
            System.out.println("Digite o nome de uma cidade (ou 'São Paulo' para encerrar):");
            cidade = teclado.nextLine();
        }
        System.out.println("A cidade digitada é São Paulo. Encerrando o programa.");
      }
    }
    
}
