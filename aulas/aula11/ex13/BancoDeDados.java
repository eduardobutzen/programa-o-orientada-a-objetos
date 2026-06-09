public class BancoDeDados implements AcessoDados {
    public void conectar() { System.out.println("Conectando ao banco de dados..."); }
    public void desconectar() { System.out.println("Desconectando do banco de dados..."); }
    public void inserir() { System.out.println("Inserindo dados..."); }
    public void atualizar() { System.out.println("Atualizando dados..."); }
    public void excluir() { System.out.println("Excluindo dados..."); }
}
