package aula2.exercícios;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String cidade;

        while (true) {
            System.out.print("Digite o nome de uma cidade (ou 'São Paulo' para encerrar): ");
            cidade = teclado.nextLine();

            if (cidade.equalsIgnoreCase("Sao Paulo")) {
                break;
            }
        }

        System.out.println("Programa encerrado.");
        teclado.close();
    }
}