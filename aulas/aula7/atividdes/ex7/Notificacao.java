package aula7.atividdes.ex7;

public abstract class Notificacao {

    public abstract void enviar(String mensagem);

    @Override
    public String toString() {
        return "Notificacao[tipo=" + getClass().getSimpleName() + "]";
    }

}