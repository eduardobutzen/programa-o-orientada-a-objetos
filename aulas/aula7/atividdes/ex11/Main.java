package aula7.atividdes.ex11;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static int contarMulheres(List<Pessoa> pessoas) {
        int total = 0;
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("F")) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Ana Lima",       28, "F"));
        pessoas.add(new Pessoa("Carlos Souza",   35, "M"));
        pessoas.add(new Pessoa("Beatriz Costa",  22, "F"));
        pessoas.add(new Pessoa("Diego Martins",  40, "M"));
        pessoas.add(new Pessoa("Fernanda Rocha", 31, "F"));
        pessoas.add(new Pessoa("Lucas Pereira",  19, "M"));
        pessoas.add(new Pessoa("Julia Mendes",   26, "F"));
        pessoas.add(new Pessoa("Rafael Nunes",   45, "M"));

        System.out.println("+----------------------+-------+------+");
        System.out.println("|  Nome                | Idade | Sexo |");
        System.out.println("+----------------------+-------+------+");

        for (Pessoa p : pessoas) {
            System.out.printf("| %-20s |  %3d  |  %s   |%n",
                p.getNome(), p.getIdade(), p.getSexo());
        }

        System.out.println("+----------------------+-------+------+");

        int totalMulheres = contarMulheres(pessoas);
        System.out.println("\nQuantidade de mulheres: " + totalMulheres);
    }
}
