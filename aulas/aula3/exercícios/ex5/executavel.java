package aula3.exercícios.ex5;
import java.util.Scanner;

public class executavel {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

            pruduto produto = new pruduto();

            System.out.println("Digite o nome do produto: ");
            produto.nome = teclado.nextLine();

            System.out.println("Digite o preço do produto: ");
            produto.preco = teclado.nextDouble();

            System.out.println("Digite a quantidade em estoque do produto: ");
            produto.QuantidadeEstoque = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Produto cadastrado: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Quantidade em estoque: " + produto.QuantidadeEstoque);


        double valorTotalEstoque = 0;
        valorTotalEstoque += produto.preco * produto.QuantidadeEstoque;

        System.out.println("Valor total do estoque: " + valorTotalEstoque);

        teclado.close();

    }
    
}
