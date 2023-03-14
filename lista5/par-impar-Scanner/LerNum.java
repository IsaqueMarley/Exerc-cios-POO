import java.util.Scanner;

public class LerNum{
  public static void main(String[] args){
    Pares par = new Pares();
    Impares impar = new Impares();

    int vetor[] = new int[10];
     
     Scanner myInput = new Scanner(System.in);
     

     for (int i = 0; i< 10; i++){
	  int value = myInput.nextInt(); 
          vetor[i] = value; 
     }
     
    par.pares(vetor);
    impar.impares(vetor);
      
    
  }
}