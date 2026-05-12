package aula7.atividdes.ex3;

public class Gerente extends Funcionario {
    private static final double PERCENTUAL_BONUS = 0.20; // 20% de bônus

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double valorBonus = salarioBase * PERCENTUAL_BONUS;
        double salarioFinal = salarioBase + valorBonus;

        System.out.println("Gerente: " + nome);
        System.out.printf("Salário base:    R$ %.2f%n", salarioBase);
        System.out.printf("Bônus (%.0f%%):     R$ %.2f%n", PERCENTUAL_BONUS * 100, valorBonus);
        System.out.printf("Salário final:   R$ %.2f%n", salarioFinal);
    }

    public static void main(String[] args) {
        System.out.println("=== Funcionário comum ===");
        Funcionario f = new Funcionario("Carlos", 2500.00);
        f.calcularSalario();

        System.out.println();

        System.out.println("=== Gerente ===");
        Gerente g = new Gerente("Ana", 5000.00);
        g.calcularSalario();
    }
}