package aula7.atividdes.ex2;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void desconto() {
        System.out.println("Este produto não possui desconto.");
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}