package aula5;


// getter e setter

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        this.setNome (nome); //será chamado o set pois tem uma validação
        this.setIdade (idade); //será chamado o set pois tem uma validação
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {

        if (nome == null || nome.isBlank()  ){

            System.out.println("Impossivel atribuir esse nome!");
            
        }else{

             this.nome = nome;

        }
    }

    public void setIdade(int idade) {

        if (idade < 0) {

            System.out.println("Impossível atribuir idade negativa");
            System.err.println("Idade inválida!");
        }
        else {
            this.idade = idade;
        }
    }

}