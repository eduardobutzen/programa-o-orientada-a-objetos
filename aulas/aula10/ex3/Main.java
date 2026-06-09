public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.limite = 500;
        cc.depositar(100);
        cc.sacar(50);

        ContaInvestimento ci = new ContaInvestimento();
        ci.depositar(100);
        ci.sacar(50);
    }
}
