package aula5;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);

        Pessoa p = new Pessoa ("ricardo", 40);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());

        System.out.println("Digite um novo nome: ");
        String novoNome = teclado.nextLine();
        p.setNome(novoNome);
        System.out.println("Nome: " + p.getNome());
        
        System.out.println("Digite a nova idade: ");
        int novaIdade = teclado.nextInt();
        p.setIdade(novaIdade);
        System.out.println("Idade: " + p.getIdade());
        
        teclado.close();
 
    }
    
}
