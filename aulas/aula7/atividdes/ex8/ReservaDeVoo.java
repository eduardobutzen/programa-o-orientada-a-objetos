package aula7.atividdes.ex8;

public class ReservaDeVoo extends Reserva {

    private String voo;
    private String origem;
    private String destino;
    private String classeVoo;
    private double preco;

    public ReservaDeVoo(String id, String cliente, String voo, String origem, String destino) {
        super(id, cliente);
        this.voo = voo;
        this.origem = origem;
        this.destino = destino;
        this.classeVoo = "Economica";
        this.preco = 800.00;
    }

    @Override
    public void adicionar() {
        adicionar("Economica", 800.00);
    }

    public void adicionar(String classeVoo, double preco) {
        this.classeVoo = classeVoo;
        this.preco = preco;
        ativa = true;
        linha();
        System.out.println("|          RESERVA DE VOO                      |");
        linha();
        System.out.printf("|  ID        : %-31s|%n", id);
        System.out.printf("|  Cliente   : %-31s|%n", cliente);
        System.out.printf("|  Voo       : %-31s|%n", voo);
        System.out.printf("|  Trecho    : %-31s|%n", origem + " -> " + destino);
        System.out.printf("|  Classe    : %-31s|%n", classeVoo);
        System.out.printf("|  Preco     : R$ %-28.2f|%n", preco);
        System.out.println("|  Status    : Reserva confirmada              |");
        linha();
    }

    @Override
    public void cancelar() {
        if (!ativa) {
            System.out.println("  [VOO] Reserva " + id + " ja esta cancelada.");
            return;
        }
        ativa = false;
        linha();
        System.out.println("|          CANCELAMENTO DE VOO                 |");
        linha();
        System.out.printf("|  ID        : %-31s|%n", id);
        System.out.printf("|  Cliente   : %-31s|%n", cliente);
        System.out.printf("|  Voo       : %-31s|%n", voo);
        System.out.printf("|  Classe    : %-31s|%n", classeVoo);

        if (classeVoo.equalsIgnoreCase("Executiva")) {
            double reembolso = preco * 0.90;
            System.out.println("|  Politica  : Reembolso de 90% (Executiva)    |");
            System.out.printf("|  Reembolso : R$ %-28.2f|%n", reembolso);
        } else {
            double reembolso = preco * 0.50;
            System.out.println("|  Politica  : Reembolso de 50% (Economica)    |");
            System.out.printf("|  Reembolso : R$ %-28.2f|%n", reembolso);
        }

        System.out.println("|  Status    : Reserva cancelada               |");
        linha();
    }
}
