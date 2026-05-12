package aula7.atividdes.ex5;

public class Cliente {
    private String nome;
    private double percentualDesconto; // ex: 0.10 = 10%

    public Cliente(String nome, double percentualDesconto) {
        this.nome = nome;
        this.percentualDesconto = percentualDesconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }
}
