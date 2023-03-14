public class Menor{
  private int menor;
  public void menor(int vetor[]){
	for (int i = 0 ; i< vetor.length ; i++){
	     	
		if (i==0) {
  		    menor = vetor[i];
		}
		else{
		    if (menor > vetor[i]){
			menor  = vetor[i];
		    }
		}
        }
	System.out.println("MENOR: "+ menor);
  }
}