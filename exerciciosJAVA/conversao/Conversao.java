public class Conversao{
	private double galoes;
	
	public void setGaloes(Double novaQtde){
		galoes = novaQtde;
	}

	//getGaloes eh um metodo
	public Double getGaloes(){
		return galoes;
	}
	
	public double doIT(){
		return (galoes*3.7468);
	}
	

}
