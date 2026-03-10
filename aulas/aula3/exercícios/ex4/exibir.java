package aula3.exercícios.ex4;

public class exibir {

    public static void main(String[] args) {
        
        livro livro1 = new livro();

        livro1.titulo = "O Senhor dos Anéis";
        livro1.autor = "J.R.R. Tolkien";
        livro1.anoPublicacao = 1954;

        System.out.println("Título: " + livro1.titulo);
        System.out.println("Autor: " + livro1.autor);
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);

    }
    
}
