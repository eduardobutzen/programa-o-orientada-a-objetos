package aula5.atividades;

public class Main {
    public static void main(String[] args) {
        Aluno a = new Aluno("Ricardo", 7.43, 5.8);
        System.out.println("Nome do aluno: " + a.getNome());
        System.out.println("Nota 1: " + a.getNota1());
        System.out.println("Nota 2: " + a.getNota2());
        System.out.println("Média: " + a.calculaMedia());

        a.setNota1(7.90);
        a.setNota2(8.43);
        System.out.println("Média final: " + a.calculaMedia());
    }
}
