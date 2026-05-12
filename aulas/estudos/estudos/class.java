public class Aluno {

    //atributos privados
    private String nome;
    private double nota;



    //contrutor
    public Aluno (String nome, double nota){

        this.nome = nome;
        this.nota = nota;
    

    }

    //getters e setters
    public String getNome(){

        return nome;
    }

    public double getNota(){

        return nota;
    }

    public void setNome(String nome){

        this.nome = nome;
    }


    public void setNota(double nota){

        this.nota = nota;
    }

    public String aprovado(){

        if (nota >= 7){

            return "aprovado";
        } else{

            return "reprovado";
        }
    
    }


    public void exibirInformacoes(){

        System.out.println("nome: " + nome);
        System.out.println("nota: " + nota);
        System.out.println("nome: " + aprovado());

    }
}
