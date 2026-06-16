package aulas.aula12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno ("Eduardo", "18");
        Aluno aluno2 = new Aluno ("Maria", "22");
        Aluno aluno3 = new Aluno ("Fernando", "25");

        try {
            FileWriter fileWriter = new FileWriter("alunos.txt");
            BufferedWriter escritor = new BufferedWriter(fileWriter);


            escritor.write(aluno1.getNome() + "," + aluno1.getIdade());
            escritor.newLine();
            escritor.write(aluno2.getNome() + "," + aluno2.getIdade());
            escritor.newLine();
            escritor.write(aluno3.getNome() + "," + aluno3.getIdade());
            escritor.newLine();

            escritor.close();
            fileWriter.close();

            System.out.println("Arquivos salvos no arquivo alunos.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            FileReader arquivo = new FileReader("alunos.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            String linha = leitor.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = leitor.readLine();
            }

            leitor.close();
            arquivo.close();

            System.out.println("Arquivos lidos com sucesso");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
