public class Valores{
  private int valor1;
  private int valor2;

  public void setValor1(int novoValor1){
    valor1 = novoValor1; 
  }
  public int getValor1(int novoValor1){
    return valor1;
  }

  
  public void setValor2(int novoValor2){
    valor2 = novoValor2; 
  }
  public int getValor2(int novoValor2){
    return valor2;
  }


  public void mostrarMaior(){
    int valorEscolhido = (valor1 > valor2)? valor1 : valor2 ;
    System.out.println(valorEscolhido);
  }
}