public class BancoDeDados implements AcessoDados {
    public void conectar() {
        System.out.println("Conectando");
    }

    public void desconectar() {
        System.out.println("Desconectando");
    }

    public void inserir() {
        System.out.println("Inserindo");
    }

    public void atualizar() {
        System.out.println("Atualizando");
    }

    public void excluir() {
        System.out.println("Excluindo");
    }
}
