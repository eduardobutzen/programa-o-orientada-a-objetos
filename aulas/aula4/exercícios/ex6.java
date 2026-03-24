package aula4.exercícios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double premio = 5000.0;

        try {
            System.out.print("Digite o número de ganhadores: ");
            int ganhadores = scanner.nextInt();

            if (ganhadores == 0) {
                throw new ArithmeticException("Não é possível dividir por zero.");
            }

            double valorPorPessoa = premio / ganhadores;

            System.out.println("Cada ganhador receberá: R$ " + valorPorPessoa);

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número inteiro válido.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado.");
        } finally {
            scanner.close();
        }
    }
}
