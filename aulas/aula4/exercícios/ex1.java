package aula4.exercícios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Não é possível calcular a raiz quadrada de número negativo.");
            } else {
                double raiz = Math.sqrt(numero);
                System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
            }

        } catch (Exception e) {
            System.out.println("Erro: você deve digitar um número inteiro válido.");
        }

        scanner.close();
    }
}