public class GravidadeLua{
        private double peso;
	
	public void setPeso(Double novoPeso){
		peso = novoPeso;
	}
	
	public Double getPeso(){
		return peso;
	}

	public Double pesoNaLua(){
		return (peso*0.17);
	}
}