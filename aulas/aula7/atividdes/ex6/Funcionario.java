package aula7.atividdes.ex6;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Sobrecarga 1: aumento por porcentagem fixa (todos os funcionários)
    public void aumentarSalario(double percentual) {
        double aumento = salario * percentual;
        salario += aumento;
        System.out.printf("  Aumento de %.0f%% aplicado: + R$ %.2f%n", percentual * 100, aumento);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s | Salário: R$ %.2f", nome, salario);
    }
}
