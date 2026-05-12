package aula7.atividdes.ex6;

public class Desenvolvedor extends Funcionario {
    private int horasExtras;
    private static final double VALOR_HORA_EXTRA = 75.00;

    public Desenvolvedor(String nome, double salario, int horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double calcularHorasExtras() {
        return horasExtras * VALOR_HORA_EXTRA;
    }

    @Override
    public String toString() {
        return String.format("Desenvolvedor: %s | Salário: R$ %.2f | Horas Extras: %d (R$ %.2f)",
                nome, salario, horasExtras, calcularHorasExtras());
    }
}
