package aula7.atividdes.ex3;

public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println("Funcionário: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salarioBase);
    }
}
