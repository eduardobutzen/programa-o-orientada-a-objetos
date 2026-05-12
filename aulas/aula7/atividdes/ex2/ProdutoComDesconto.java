package aula7.atividdes.ex2;

public class ProdutoComDesconto extends Produto {
    private static final double PERCENTUAL_DESCONTO = 0.15; // 15% de desconto

    public ProdutoComDesconto(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void desconto() {
        double valorDesconto = preco * PERCENTUAL_DESCONTO;
        double precoFinal = preco - valorDesconto;

        System.out.println("Produto: " + nome);
        System.out.printf("Preço original:   R$ %.2f%n", preco);
        System.out.printf("Desconto (%.0f%%):   R$ %.2f%n", PERCENTUAL_DESCONTO * 100, valorDesconto);
        System.out.printf("Preço com desconto: R$ %.2f%n", precoFinal);
    }

    public static void main(String[] args) {
        System.out.println("=== Produto SEM desconto ===");
        Produto p1 = new Produto("Teclado", 150.00);
        p1.desconto();

        System.out.println();

        System.out.println("=== Produto COM desconto ===");
        ProdutoComDesconto p2 = new ProdutoComDesconto("Monitor", 1200.00);
        p2.desconto();
    }
}