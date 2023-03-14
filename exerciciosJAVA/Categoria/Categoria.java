public class Categoria{
  private int idade;
  	
  public void setIdade(int novaIdade){
    idade = novaIdade;
  }
  public int getIdade(){
    return idade;
  }

  public void avaliarCategoria(){
      if (this.idade > 45){
	 System.out.println("Sênior");
      }else if (this.idade >= 31){
    	 System.out.println("Adulto");
      }else if (this.idade >= 16){
    	 System.out.println("Adolescente");
      }else if (this.idade >= 11){
    	 System.out.println("Jovem");
      }else{
	 System.out.println("Infantil");
      }
  }
}