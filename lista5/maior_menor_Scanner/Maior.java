public class Maior{
  private int maior;
  public void maior(int vetor[]){
	for (int i = 0 ; i< vetor.length ; i++){
	     	
		if (i==0){
			maior = vetor[i];
   		} 
  		    
		else{
		    if (maior < vetor[i]){
			maior  = vetor[i];
		    }
		}
        }
	System.out.println("MAIOR: "+ maior);
  }
}