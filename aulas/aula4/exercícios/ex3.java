package aula4.exercícios;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String entrada = scanner.nextLine();

        try {
            double numero = Double.parseDouble(entrada);
            System.out.println("Valor convertido: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido. Digite um número válido.");
        } finally {
            scanner.close();
        }
    }
}
