package aula2.exercícios;

import java.util.Scanner;

// Escreva um programa Java que use um laço para ler a nota de vários alunos até
//que seja lida a nota -1

public class ex4 {

    public static void main(String[] args) {

        int nota = 0;
        int soma = 0;
        int contador = 0;

        java.util.Scanner teclado = new java.util.Scanner(System.in);

        while (nota != -1) {
            System.out.println("Digite a nota do aluno (ou -1 para encerrar):");
            nota = teclado.nextInt();
            if (nota != -1) {
                soma += nota;
                contador++;
            }
        }

        teclado.close();
    }

}
