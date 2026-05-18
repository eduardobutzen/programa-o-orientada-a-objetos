package aula7.atividdes.ex8;

public class ReservaDeHotel extends Reserva {

    private String hotel;
    private String quarto;
    private int noites;
    private double precoPorNoite;

    public ReservaDeHotel(String id, String cliente, String hotel, String quarto, int noites, double precoPorNoite) {
        super(id, cliente);
        this.hotel = hotel;
        this.quarto = quarto;
        this.noites = noites;
        this.precoPorNoite = precoPorNoite;
    }

    @Override
    public void adicionar() {
        ativa = true;
        linha();
        System.out.println("|          RESERVA DE HOTEL                    |");
        linha();
        System.out.printf("|  ID        : %-31s|%n", id);
        System.out.printf("|  Cliente   : %-31s|%n", cliente);
        System.out.printf("|  Hotel     : %-31s|%n", hotel);
        System.out.printf("|  Quarto    : %-31s|%n", quarto);
        System.out.printf("|  Noites    : %-31d|%n", noites);
        System.out.printf("|  Total     : R$ %-28.2f|%n", noites * precoPorNoite);
        System.out.println("|  Status    : Reserva confirmada              |");
        linha();
    }

    @Override
    public void cancelar() {
        if (!ativa) {
            System.out.println("  [HOTEL] Reserva " + id + " ja esta cancelada.");
            return;
        }
        double multa = noites * precoPorNoite * 0.20;
        ativa = false;
        linha();
        System.out.println("|          CANCELAMENTO DE HOTEL               |");
        linha();
        System.out.printf("|  ID        : %-31s|%n", id);
        System.out.printf("|  Cliente   : %-31s|%n", cliente);
        System.out.printf("|  Hotel     : %-31s|%n", hotel);
        System.out.println("|  Politica  : Multa de 20% sobre o total      |");
        System.out.printf("|  Multa     : R$ %-28.2f|%n", multa);
        System.out.println("|  Status    : Reserva cancelada               |");
        linha();
    }
}