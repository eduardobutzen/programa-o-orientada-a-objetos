package aula7.atividdes.ex4;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método original: deposita um valor em double
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    // Sobrecarga: deposita o valor de um objeto Cheque
    public void depositar(Cheque cheque) {
        double valor = cheque.getValor();
        if (valor <= 0) {
            System.out.println("Cheque com valor inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Cheque de %s no valor de R$ %.2f depositado com sucesso.%n",
                cheque.getTitular(), valor);
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", 1000.00);

        System.out.println("=== Conta de: " + conta.getTitular() + " ===");
        System.out.printf("Saldo inicial: R$ %.2f%n", conta.getSaldo());
        System.out.println();

        System.out.println("--- Depósito em dinheiro ---");
        conta.depositar(500.00);
        System.out.println();

        System.out.println("--- Depósito via cheque ---");
        Cheque cheque = new Cheque("Maria Souza", 750.00);
        conta.depositar(cheque);
    }
}