public class LerRaio{
	private Double raio;
	
	public void setRaio(Double novoRaio){
		raio = novoRaio;
	}
	
	public Double getRaio(){
		return raio;
	}

	public Double areaCirculo(){
		return (3.14*Math.pow(raio,2));
	}
}