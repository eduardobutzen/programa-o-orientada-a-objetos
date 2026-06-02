package aula8.ex1;

import java.util.Scanner;

public class Netbook extends Computador {

    public Netbook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return "Marca: " + Marca;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a marca do Netbook: ");
        String marca = scanner.nextLine();

        Netbook netbook = new Netbook(marca);
        System.out.println(netbook.exibeMarca());
        System.out.println(netbook.exibeModelo());

        scanner.close();
    }
}