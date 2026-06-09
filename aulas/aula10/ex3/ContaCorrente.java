public class ContaCorrente extends Conta {
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito Conta Corrente: " + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Conta Corrente: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
