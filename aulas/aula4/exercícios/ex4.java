package aula4.exercícios;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = {"Ana", "Carlos", "Maria", "João", "Pedro"};

        try {
            System.out.print("Digite um número de 0 a 4: ");
            int indice = scanner.nextInt();

            System.out.println("Nome na posição " + indice + ": " + nomes[indice]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: índice fora do limite do array (0 a 4).");
        } catch (InputMismatchException e) {
            System.out.println("Erro: você deve digitar um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro inesperado.");
        } finally {
            scanner.close();
        }
    }
}
