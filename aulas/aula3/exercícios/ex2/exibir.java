package aula3.exercícios.ex2;
import java.util.Scanner;

public class exibir {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        computador [] c = new computador[2];

        c[0] = new computador();
        c[1] = new computador();

        int i=0;
        
            System.out.println("Digite a marca, modelo, tipo e preço do computador " + (i+1) + ":");
            c[0].marca = teclado.nextLine();
            c[0].modelo = teclado.nextLine();
            c[0].tipo = teclado.nextLine();
            c[0].preço = teclado.nextLine();

            c[1].marca = "apple";
            c[1].modelo = "macbook air";
            c[1].tipo = "notebook";
            c[1].preço = "R$ 10.000,00";
            
            System.out.println("Computador " + (i+0) + ":");
            System.out.println("Marca: " + c[0].marca);
            System.out.println("Modelo: " + c[0].modelo);
            System.out.println("Tipo: " + c[0].tipo);
            System.out.println("Preço: " + c[0].preço);

            System.out.println("computador " + (i+1) + ":");
            System.out.println("Marca: " + c[1].marca);
            System.out.println("Modelo: " + c[1].modelo);
            System.out.println("Tipo: " + c[1].tipo);
            System.out.println("Preço: " + c[1].preço);

            teclado.close();


    }
    
}
