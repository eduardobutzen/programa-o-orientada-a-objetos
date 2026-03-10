package aula3.exercícios.ex6;
import java.util.Scanner;

public class exibir {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        aluno aluno = new aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = teclado.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        aluno.Matricula = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Digite a nota 1, nota 2 e nota 3 do aluno: ");
        aluno.nota1 = teclado.nextLine();
        aluno.nota2 = teclado.nextLine();
        aluno.nota3 = teclado.nextLine();

        double media = (Double.parseDouble(aluno.nota1) + Double.parseDouble(aluno.nota2) + Double.parseDouble(aluno.nota3)) / 3;

       if(media >= 7){
            System.out.println("nome do aluno: " + aluno.nome);
            System.out.println("matrícula do aluno: " + aluno.Matricula);
            System.out.println("Média: " + media);
            System.out.println("Aluno aprovado!");
       } else if (media >= 5) {
            System.out.println("nome do aluno: " + aluno.nome);
            System.out.println("matrícula do aluno: " + aluno.Matricula);
            System.out.println("Média: " + media);
            System.out.println("Aluno em recuperação!");
       } else {
            System.out.println("nome do aluno: " + aluno.nome);
            System.out.println("matrícula do aluno: " + aluno.Matricula);
            System.out.println("Média: " + media);
            System.out.println("Aluno reprovado!");
       }    

        teclado.close();

    }
    
}
