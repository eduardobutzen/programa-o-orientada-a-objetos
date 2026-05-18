package aula7.atividdes.ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Notebook",    3499.90, 10));
        produtos.add(new Produto("Mouse",         89.90, 50));
        produtos.add(new Produto("Teclado",      199.90, 30));
        produtos.add(new Produto("Monitor",     1299.90, 15));
        produtos.add(new Produto("Headset",      349.90, 25));

        System.out.println("+---------------------------+------------+-----------+");
        System.out.println("|  Nome                     |     Preco  | Qtd       |");
        System.out.println("+---------------------------+------------+-----------+");

        for (Produto p : produtos) {
            System.out.printf("| %-25s | R$ %7.2f | %-9d |%n",
                p.getNome(), p.getPreco(), p.getQuantidade());
        }

        System.out.println("+---------------------------+------------+-----------+");
    }
}