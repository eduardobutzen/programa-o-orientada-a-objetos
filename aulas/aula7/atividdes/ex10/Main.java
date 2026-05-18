package aula7.atividdes.ex10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Ana Lima",       8.5, 7.0));
        alunos.add(new Aluno("Carlos Souza",   4.0, 5.5));
        alunos.add(new Aluno("Beatriz Costa",  6.0, 6.0));
        alunos.add(new Aluno("Diego Martins",  3.5, 4.0));
        alunos.add(new Aluno("Fernanda Rocha", 9.0, 8.5));
        alunos.add(new Aluno("Lucas Pereira",  5.5, 6.5));

        System.out.println("+----------------------+-------+-------+-------+------------+");
        System.out.println("|  Nome                | Nota1 | Nota2 | Media | Situacao   |");
        System.out.println("+----------------------+-------+-------+-------+------------+");

        for (Aluno a : alunos) {
            double media = a.getMedia();
            String situacao = media >= 6.0 ? "Aprovado" : "Reprovado";

            System.out.printf("| %-20s |  %4.1f |  %4.1f |  %4.1f | %-10s |%n",
                a.getNome(), a.getNota1(), a.getNota2(), media, situacao);
        }

        System.out.println("+----------------------+-------+-------+-------+------------+");
    }
}