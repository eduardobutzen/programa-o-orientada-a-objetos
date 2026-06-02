package aula9.abstract;

public class Cachorro extends Animal {

    public void emiteSom(){
            System.out.println("au au au");

    }

    public void exibeInfo(){
        System.out.println(especie);
        System.out.println(idade);
        System.out.println(raca);
    }

}
