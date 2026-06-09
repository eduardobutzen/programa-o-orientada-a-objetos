public class PessoaJuridica extends Pessoa {
    protected String cnpj;

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cnpj) { this.cnpj = cnpj; }

    public void efetuarCompra() {
        System.out.println("Pessoa Jurídica efetuando compra");
    }
}
