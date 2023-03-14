import java.util.Scanner;

public class Main{
  public static void main(String[] args){
     Maior maior = new Maior();
     Menor menor = new Menor();
     Scanner myInput = new Scanner(System.in);
     int vetor[] = new int[10];
     for (int i =0 ; i<10; i++){
	  int value = myInput.nextInt();
          vetor[i] = value;
     }
   
    maior.maior(vetor);
    menor.menor(vetor);	
  } 
}