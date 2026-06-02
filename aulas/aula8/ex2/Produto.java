package aula8.ex2;

public class Produto {
    
    protected String nome;
    protected double preco;

    public Produto (String nome, double preco){

        this.nome = nome;
        this.preco = preco;

    }

    public void desconto (){

        System.out.println("Esse produto não possui desconto.");
        System.out.println("Preço: R$ " + String.format("%.2f", preco));

    }

}
