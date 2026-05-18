package aula7.atividdes.ex13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static Conta contaComMaiorSaldo(List<Conta> contas) {
        Conta maior = contas.get(0);
        for (Conta c : contas) {
            if (c.getSaldo() > maior.getSaldo()) {
                maior = c;
            }
        }
        return maior;
    }

    public static void main(String[] args) {

        List<Conta> contas = new ArrayList<>();

        contas.add(new Conta("0001-2", "Ana Lima",       1500.00));
        contas.add(new Conta("0002-8", "Carlos Souza",   8750.50));
        contas.add(new Conta("0003-4", "Beatriz Costa",   320.75));
        contas.add(new Conta("0004-1", "Diego Martins",  5100.00));
        contas.add(new Conta("0005-7", "Fernanda Rocha", 12340.90));
        contas.add(new Conta("0006-3", "Lucas Pereira",  2980.30));

        System.out.println("+----------+------------------+---------------+");
        System.out.println("|  Numero  |  Titular         |  Saldo        |");
        System.out.println("+----------+------------------+---------------+");

        for (Conta c : contas) {
            System.out.printf("| %-8s | %-16s | R$ %9.2f |%n",
                c.getNumero(), c.getTitular(), c.getSaldo());
        }

        System.out.println("+----------+------------------+---------------+");

        Conta maior = contaComMaiorSaldo(contas);

        System.out.println("\n=== CONTA COM MAIOR SALDO ===");
        System.out.println("+----------+------------------+---------------+");
        System.out.printf("| %-8s | %-16s | R$ %9.2f |%n",
            maior.getNumero(), maior.getTitular(), maior.getSaldo());
        System.out.println("+----------+------------------+---------------+");
    }
}