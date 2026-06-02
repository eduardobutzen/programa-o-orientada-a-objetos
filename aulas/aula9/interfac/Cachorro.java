package aula9.interfac;

public class Cachorro  implements Animal{

    public String nome;
    public String raca;
    public int idade;

    @Override
    public void emitirSom(){

        System.out.println("au au au!");
    }

    public void exibirInfo(){

        System.out.println("Cachorro: ");
        System.out.println("nome: " +nome);
        System.out.println("raça: " +raca);
        System.out.println("idade: "+idade);
    }
    
}
