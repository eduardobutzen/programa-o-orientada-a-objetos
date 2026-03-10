package aula2.exercícios;

import java.util.Scanner;


// laço para ler uma sequência de números inteiros do usuário até que o número 0 seja lido.
public class ex3 {

    public static void main(String[] args) {

            int soma = 0;
            int numero = -1; // Inicializa com um valor diferente de 0 para entrar no loop
    
            Scanner teclado = new Scanner(System.in);
    
            while (numero != 0) {
                System.out.println("Digite um número inteiro (0 para sair):");
                numero = teclado.nextInt();
                soma += numero; // Adiciona o número à soma
            }
    
            System.out.println("A soma dos números digitados é: " + soma);
    
            teclado.close();
      

    }
    
}
