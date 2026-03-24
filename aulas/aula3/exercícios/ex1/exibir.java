package aula3.exercícios.ex1;
import java.util.Scanner;

public class exibir {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        carro [] c = new carro[2];
        
        for (int i = 0; i < 2; i++) {
            c[i] = new carro();
            System.out.println("Digite a marca, modelo e ano do carro " + (i+1) + ":");
            c[i].marca = teclado.nextLine();
            c[i].modelo = teclado.nextLine();
            c[i].ano = teclado.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Carro " + (i+1) + ":");
            System.out.println("Marca: " + c[i].marca);
            System.out.println("Modelo: " + c[i].modelo);
            System.out.println("Ano: " + c[i].ano);
        }

        teclado.close();
    }
    
}
