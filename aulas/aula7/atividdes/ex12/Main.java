package aula7.atividdes.ex12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Dom Casmurro",               "Machado de Assis", 1899));
        livros.add(new Livro("O Senhor dos Aneis",         "J.R.R. Tolkien",   1954));
        livros.add(new Livro("1984",                       "George Orwell",    1949));
        livros.add(new Livro("Harry Potter",               "J.K. Rowling",     1997));
        livros.add(new Livro("O Alquimista",               "Paulo Coelho",     1988));
        livros.add(new Livro("Cem Anos de Solidao",        "Gabriel Garcia",   1967));
        livros.add(new Livro("A Metamorfose",              "Franz Kafka",      1915));

        livros.sort(Comparator.comparingInt(Livro::getAno));

        System.out.println("+-------------------------------+--------------------+------+");
        System.out.println("|  Titulo                       |  Autor             |  Ano |");
        System.out.println("+-------------------------------+--------------------+------+");

        for (Livro l : livros) {
            System.out.printf("| %-29s | %-18s | %4d |%n",
                l.getTitulo(), l.getAutor(), l.getAno());
        }

        System.out.println("+-------------------------------+--------------------+------+");
    }
}