public class ContaConcreta extends Conta {
    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do depósito não pode ser negativo.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("O valor do saque não pode ser negativo.");
        }
        if (valor > (this.saldo + this.limite)) {
            throw new IllegalArgumentException("O valor do saque é maior que o saldo e limite disponíveis.");
        }
        this.saldo -= valor;
    }
}
