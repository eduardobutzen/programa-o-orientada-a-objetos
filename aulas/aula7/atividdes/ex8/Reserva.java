package aula7.atividdes.ex8;

public abstract class Reserva {

    protected String id;
    protected String cliente;
    protected boolean ativa;

    public Reserva(String id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.ativa = false;
    }

    public abstract void adicionar();

    public abstract void cancelar();

    public boolean isAtiva() {
        return ativa;
    }

    public String getId() {
        return id;
    }

    protected void linha() {
        System.out.println("+----------------------------------------------+");
    }
}
