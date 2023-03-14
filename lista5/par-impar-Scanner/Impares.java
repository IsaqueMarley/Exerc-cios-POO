public class Impares{
  private int qtdImpares;
 
  public void impares(int vetor[]){
    for (int i=0 ; i< vetor.length ; i++ ){
       if (( vetor[i] % 2) !=0){
           qtdImpares += 1;
	   System.out.println("IMPAR: "+vetor[i]);
              }
        }
   
  }
  
}
