package aula7.atividdes.ex7;

public class NotificacaoApp extends Notificacao {

    private String nomeApp;

    public NotificacaoApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|         NOTIFICACAO PUSH (APP)               |");
        System.out.println("+----------------------------------------------+");
        System.out.printf ("|  App       : %-31s|%n", nomeApp);
        System.out.printf ("|  Mensagem  : %-31s|%n", mensagem);
        System.out.println("|  Status    : Push entregue ao dispositivo    |");
        System.out.println("+----------------------------------------------+");
    }

    public void enviar(String titulo, String mensagem) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|         NOTIFICACAO PUSH (APP)               |");
        System.out.println("+----------------------------------------------+");
        System.out.printf ("|  App       : %-31s|%n", nomeApp);
        System.out.printf ("|  Titulo    : %-31s|%n", titulo);
        System.out.printf ("|  Mensagem  : %-31s|%n", mensagem);
        System.out.println("|  Status    : Push entregue ao dispositivo    |");
        System.out.println("+----------------------------------------------+");
    }
}
