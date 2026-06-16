package aulas.aula12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aluno {

    private String nome;
    private String idade;

    public Aluno(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

}
