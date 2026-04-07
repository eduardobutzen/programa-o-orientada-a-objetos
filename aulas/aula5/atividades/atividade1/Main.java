package aula5.atividades.atividade1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ContaBancaria c = new ContaBancaria(2000, 1000);
        System.out.println("O saldo da conta: " + c.getSaldo());
        System.out.println("O limite da conta: " + c.getLimite());

        System.out.println("-----------------------------------------------");
        System.out.println("Quanto deseja sacar do seu saldo?");
        int saque = teclado.nextInt();

        if (saque > c.getSaldo()){

            System.out.println("Valor acima do limite da conta, saque não autorizado!");

        }else{

            c.setSaldo(c.getSaldo() - saque);
            System.out.println("Seu saque de " + saque + " foi concluído com sucesso, agora sua conta tem " + c.getSaldo() + " de saldo");

        }

        teclado.close();
    }
}
