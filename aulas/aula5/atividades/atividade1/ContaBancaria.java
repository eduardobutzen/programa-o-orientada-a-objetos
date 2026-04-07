package aula5.atividades.atividade1;

public class ContaBancaria {
   private int saldo;
   private int limite;

   public ContaBancaria(int saldo, int limite) {
      this.setSaldo(saldo);
      this.setLimite(limite);
   }

   public int getSaldo() {
      return this.saldo;
   }

   public int getLimite() {
      return this.limite;
   }

   public void setSaldo(int saldo) {
      this.saldo = saldo;
   }

   public void setLimite(int limite) {
      this.limite = limite;
   }
}