package aula7.atividdes.ex6;

public class Gerente extends Funcionario {
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    // Sobrecarga 2: aumento com porcentagem + bônus anual (exclusivo do Gerente)
    public void aumentarSalario(double percentual, boolean considerarBonus) {
        double aumento = salario * percentual;
        if (considerarBonus) {
            aumento += bonusAnual;
        }
        salario += aumento;
        System.out.printf("  Aumento de %.0f%%%s aplicado: + R$ %.2f%n",
                percentual * 100,
                considerarBonus ? " + bônus anual" : "",
                aumento);
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    @Override
    public String toString() {
        return String.format("Gerente: %s | Salário: R$ %.2f | Bônus Anual: R$ %.2f",
                nome, salario, bonusAnual);
    }
}
