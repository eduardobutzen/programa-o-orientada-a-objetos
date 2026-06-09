public class ContaInvestimento extends Conta {
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito Conta Investimento: " + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Conta Investimento: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
