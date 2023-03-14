public class AppConta{
  public static void main(String[] args){
    Conta conta = new Conta("ISAQUE M V", "6898-4",574000.0,940.0);

    conta.exibirDados();
    conta.depositar(10.0);
    conta.exibirDados();

    conta.sacar(574010.0);
    conta.exibirDados();

    conta.depositar(5.0);
     conta.exibirDados();
  }
}