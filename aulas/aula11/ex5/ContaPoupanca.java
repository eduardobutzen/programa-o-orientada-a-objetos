public class ContaPoupanca extends Conta {
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito Conta Poupança. Saldo: " + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Conta Poupança. Saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança.");
        }
    }

    public void atualizaJuros() {
        this.saldo += this.saldo * 0.03;
        System.out.println("Juros atualizados. Saldo: " + this.saldo);
    }
}
