package aula4.exercícios;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius (ex: 25.5): ");
        String entrada = scanner.nextLine();

        try {
            double celsius = Double.parseDouble(entrada);
            double fahrenheit = (celsius * 9/5) + 32;

            System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        } catch (NumberFormatException e) {
            System.out.println("Erro: valor inválido. Use ponto (ex: 25.5) e não vírgula.");
        } finally {
            scanner.close();
        }
    }
}
