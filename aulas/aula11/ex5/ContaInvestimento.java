public class ContaInvestimento extends Conta {
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito Conta Investimento. Saldo: " + this.saldo);
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque Conta Investimento. Saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente na Conta Investimento.");
        }
    }

    public void atualizaRendimentos() {
        this.saldo += this.saldo * 0.05;
        System.out.println("Rendimentos atualizados. Saldo: " + this.saldo);
    }
}
