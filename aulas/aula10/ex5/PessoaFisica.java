public class PessoaFisica extends Pessoa {
    protected String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void efetuarCompra() {
        System.out.println("Pessoa Fisica comprando");
    }
}
