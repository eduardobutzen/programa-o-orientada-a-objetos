package aula7.atividdes.ex8;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n=== ADICIONAR RESERVAS ===\n");

        ReservaDeHotel hotel = new ReservaDeHotel(
            "HTL-001", "Ana Lima",
            "Grand Palace Hotel", "Suite Luxo", 3, 450.00
        );
        hotel.adicionar();
        System.out.println();

        ReservaDeVoo vooEconomico = new ReservaDeVoo(
            "VOO-001", "Carlos Mendes",
            "LA2045", "Sao Paulo", "Rio de Janeiro"
        );
        vooEconomico.adicionar("Economica", 320.00);
        System.out.println();

        ReservaDeVoo vooExecutivo = new ReservaDeVoo(
            "VOO-002", "Beatriz Souza",
            "LA3080", "Sao Paulo", "Lisboa"
        );
        vooExecutivo.adicionar("Executiva", 4200.00);
        System.out.println();

        System.out.println("=== CANCELAMENTOS VIA POLIMORFISMO ===\n");

        Reserva[] reservas = { hotel, vooEconomico, vooExecutivo };

        for (Reserva r : reservas) {
            r.cancelar();
            System.out.println();
        }

        System.out.println("=== TENTATIVA DE CANCELAR RESERVA JA CANCELADA ===\n");

        for (Reserva r : reservas) {
            r.cancelar();
        }
    }
}