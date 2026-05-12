package aula7.atividdes.ex1;

import java.util.Scanner;

public class Notebook extends Computador {

    public Notebook(String marca) {
        super(marca, "Portátil");
    }

    public String exibeMarca() {
        return "Marca: " + Marca;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do Notebook: ");
        String marca = scanner.nextLine();

        Notebook notebook = new Notebook(marca);

        System.out.println("\n--- Notebook ---");
        System.out.println(notebook.exibeMarca());
        System.out.println(notebook.exibeModelo());

        scanner.close();
    }
}
