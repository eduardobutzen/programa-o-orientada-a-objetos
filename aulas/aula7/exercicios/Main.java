package aula7.exercicios;

public class Main {

    public static void main(String[] args) {
        
        Pessoa p = new Pessoa ("Ricardo", 41);
        exibirDadosPessoa(p);

        Endereco end = new Endereco("rua dos andradas", 1465);
        exibirDadosEnd(end);

    }

    public static void exibirDadosPessoa(Pessoa pe){

        System.out.println("nome:" +pe.getNome());
        System.out.println("Idade: " +pe.getIdade());
    }

    public static void exibirDadosEnd(Endereco e){

        System.out.println("rua:" +e.getRua());
        System.out.println("numero:" +e.getNumero());
    }

}