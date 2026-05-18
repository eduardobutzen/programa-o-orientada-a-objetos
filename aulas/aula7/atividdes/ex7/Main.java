package aula7.atividdes.ex7;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=== POLIMORFISMO (referencia da classe pai) ===\n");

        Notificacao[] notificacoes = {
            new NotificacaoEmail("sistema@empresa.com"),
            new NotificacaoApp("MeuApp")
        };

        for (Notificacao n : notificacoes) {
            n.enviar("Mensagem via referencia polimorfica");
            System.out.println();
        }

        System.out.println("=== NotificacaoEmail: sobrescrita + sobrecarga ===\n");

        NotificacaoEmail email = new NotificacaoEmail("noreply@sistema.com");

        email.enviar("Aviso: manutencao programada para esta noite.");
        System.out.println();

        email.enviar("joao@empresa.com", "Seu relatorio esta pronto.");
        System.out.println();

        email.enviar(
            "Reuniao de alinhamento amanha as 10h.",
            "ana@empresa.com",
            "carlos@empresa.com",
            "lucia@empresa.com"
        );
        System.out.println();

        System.out.println("=== NotificacaoApp: sobrescrita + sobrecarga ===\n");

        NotificacaoApp app = new NotificacaoApp("FinanceiroApp");

        app.enviar("Voce tem uma nova mensagem.");
        System.out.println();

        app.enviar("Cobranca pendente", "Sua fatura de R$ 150,00 vence amanha.");
        System.out.println();
    }
}
