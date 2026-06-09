public class Gerente extends Funcionario {
    public void calcularSalario() {
        double salarioComBonus = this.salario * 1.20;
        System.out.println("Salário do Gerente com bônus (20%): " + salarioComBonus);
    }
}
