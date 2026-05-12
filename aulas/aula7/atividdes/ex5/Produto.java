package aula7.atividdes.ex5;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método original: retorna o preço final com base no double passado
    public double calcularPrecoFinal(double preco) {
        System.out.println("Produto: " + nome);
        System.out.printf("Preço informado: R$ %.2f%n", preco);
        System.out.printf("Preço final:     R$ %.2f%n", preco);
        return preco;
    }

    // Sobrecarga: calcula o preço final aplicando o desconto do cliente
    public double calcularPrecoFinal(Cliente cliente) {
        double desconto = preco * cliente.getPercentualDesconto();
        double precoFinal = preco - desconto;

        System.out.println("Produto: " + nome);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.printf("Preço original:    R$ %.2f%n", preco);
        System.out.printf("Desconto (%.0f%%):    R$ %.2f%n",
                cliente.getPercentualDesconto() * 100, desconto);
        System.out.printf("Preço final:       R$ %.2f%n", precoFinal);

        return precoFinal;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);

        System.out.println("=== Sem desconto de cliente ===");
        produto.calcularPrecoFinal(3000.00);

        System.out.println();

        System.out.println("=== Com desconto de cliente ===");
        Cliente cliente = new Cliente("Ana Paula", 0.10); // 10% de desconto
        produto.calcularPrecoFinal(cliente);
    }
}
