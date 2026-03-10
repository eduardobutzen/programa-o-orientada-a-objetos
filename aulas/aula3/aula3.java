    package aula3;
    import java.util.Scanner;

    public class aula3 {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
            
            int n;
            aluno[] a = new aluno[3];
            

            for (n = 0; n < 3; n++) {


                a[n] = new aluno();
                System.out.println("Digite o nome, matricula e cpf do aluno " + (n+1) + ":");
                
                a[n].nome = teclado.nextLine();
                a[n].matricula = teclado.nextLine();
                a[n].cpf = teclado.nextLine();
                a[n].idade = teclado.nextLine();
                teclado.nextLine(); // Limpar o buffer do teclado

                System.out.println("aluno instaciado");
                System.out.println("nome: " + a[n].nome);
                System.out.println("matricula: " + a[n].matricula);
                System.out.println("cpf: " + a[n].cpf);
                System.out.println("idade: " + a[n].idade);

                teclado.close();
            }

        }
        
    }
