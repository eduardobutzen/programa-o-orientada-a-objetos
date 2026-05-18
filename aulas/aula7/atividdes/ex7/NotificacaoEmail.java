package aula7.atividdes.ex7;

public class NotificacaoEmail extends Notificacao {

    private String remetente;

    public NotificacaoEmail(String remetente) {
        this.remetente = remetente;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|        NOTIFICACAO POR E-MAIL                |");
        System.out.println("+----------------------------------------------+");
        System.out.printf ("|  De        : %-31s|%n", remetente);
        System.out.printf ("|  Mensagem  : %-31s|%n", mensagem);
        System.out.println("|  Status    : Enviado com sucesso             |");
        System.out.println("+----------------------------------------------+");
    }

    public void enviar(String destinatario, String mensagem) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|        NOTIFICACAO POR E-MAIL                |");
        System.out.println("+----------------------------------------------+");
        System.out.printf ("|  De        : %-31s|%n", remetente);
        System.out.printf ("|  Para      : %-31s|%n", destinatario);
        System.out.printf ("|  Mensagem  : %-31s|%n", mensagem);
        System.out.println("|  Status    : Enviado com sucesso             |");
        System.out.println("+----------------------------------------------+");
    }

    public void enviar(String mensagem, String... destinatarios) {
        System.out.println("+----------------------------------------------+");
        System.out.println("|      NOTIFICACAO POR E-MAIL (em massa)       |");
        System.out.println("+----------------------------------------------+");
        System.out.printf ("|  De        : %-31s|%n", remetente);
        System.out.printf ("|  Mensagem  : %-31s|%n", mensagem);
        System.out.printf ("|  Total     : %-2d destinatario(s)              |%n", destinatarios.length);
        System.out.println("+----------------------------------------------+");
        for (int i = 0; i < destinatarios.length; i++) {
            System.out.printf("|  [%d] %-40s|%n", i + 1, destinatarios[i]);
        }
        System.out.println("|  Status    : Todos enviados com sucesso      |");
        System.out.println("+----------------------------------------------+");
    }
}