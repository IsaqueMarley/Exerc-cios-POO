public class Conta{
  private String nome;
  private String conta;
  private Double saldo;
  private Double limite;

  public Conta(String nome,String conta,Double saldo,Double limite){
    this.nome = nome;
    this.conta = conta;
    this.saldo = saldo;
    this.limite = limite;
  }

  public void depositar(Double valor){
    this.saldo = this.saldo + valor;
  }

  public Boolean sacar(Double valor){
    if (valor > saldo){
	System.out.print("Valor do saque excede o saldo da conta!");
        return false;
    }else {
	this.saldo  = this.saldo - valor;
        return true;
          }
  }

  public void exibirDados(){
    System.out.print("\nnome: "+this.nome+"\n"+"saldo: "+this.saldo);
    System.out.println("\n--------------------------");
  }
  
}