package aula8.ex2;

public class ProdutoComDesconto extends Produto {
    private double percentualDesconto;

    public ProdutoComDesconto(String nome, double preco, double percentualDesconto) {
        super(nome, preco);
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public void desconto() {
        double valorDesconto = preco * (percentualDesconto / 100);
        double precoFinal = preco - valorDesconto;

        System.out.println("Produto: " + nome);
        System.out.println("Preço original: R$ " + String.format("%.2f", preco));
        System.out.println("Desconto (" + percentualDesconto + "%): R$ " + String.format("%.2f", valorDesconto));
        System.out.println("Preço com desconto: R$ " + String.format("%.2f", precoFinal));
    }
}
