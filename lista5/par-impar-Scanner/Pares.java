public class Pares{
  private int qtdPares;
 
  public void pares(int vetor[]){
	for (int i=0 ; i< vetor.length ; i++ ){
	     if (( vetor[i] % 2) ==0){
		   qtdPares += 1;
		   System.out.println("PAR: "+vetor[i]);
              }
        }
  }

  
}