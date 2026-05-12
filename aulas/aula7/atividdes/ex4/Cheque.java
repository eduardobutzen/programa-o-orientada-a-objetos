package aula7.atividdes.ex4;

public class Cheque {
    private String titular;
    private double valor;

    public Cheque(String titular, double valor) {
        this.titular = titular;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getTitular() {
        return titular;
    }
}
