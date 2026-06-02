package aula9.abstract;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.emiteSom();

        Tigre t = new Tigre();
        t.emiteSom();

        Scanner teclado = new Scanner(System.in);
        Animal a;
        int op;
        System.out.println("Digite 1 para Cachorro, 2 para tigre:");
        op = teclado.nextInt();

        if(op==1){
            a = new Cachorro();
            a.especie = "cuscus";
            a.idade = 9;
            a.raca = "Pastor alemão";
            a.emiteSom();
            a.exibeInfo();
        }else{
            a = new Tigre();
            a.especie = "cuscus";
            a.idade = 9;
            a.raca = "Gigante";
            a.emiteSom();
            a.exibeInfo();

        }
    }
    
}
