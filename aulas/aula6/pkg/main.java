package aula6.pkg;

public class main {

    public static void main(String[] args) {
        
        carro c = new carro();
        c.nome =  "fusca";
        c.exibeMsg();
        
        onibus o = new onibus();
        o.onibus = "marcopolo";
        o.setModelo = "OM-12345";
        o.exibeMsg();

    }
    
}
