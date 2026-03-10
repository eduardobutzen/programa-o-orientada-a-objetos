package aula3.exercícios.ex3;
import java.util.Scanner;

public class exibir {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        pessoa p1 = new pessoa();
        System.out.println("Digite o nome, idade e gênero da pessoa 1:");
        p1.nome = teclado.nextLine();
        p1.idade = teclado.nextLine();
        p1.Genero = teclado.nextLine();

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade);
        System.out.println("Gênero: " + p1.Genero);

        teclado.close();

    }
}
