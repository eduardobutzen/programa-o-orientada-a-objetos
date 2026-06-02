package aula8.ex2;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Teclado", 150.00);
        p1.desconto();

        System.out.println("----------------------------");

        ProdutoComDesconto p2 = new ProdutoComDesconto("Monitor", 1200.00, 15);
        p2.desconto();
    }
}