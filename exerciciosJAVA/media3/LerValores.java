public class LerValores{
	private int valor01;
	private int valor02;
	private int valor03;

	public void setValor01(int novoValor01){
		valor01 = novoValor01;
	}

	public int getValor01(){
		return valor01;
	}


	public void setValor02(int novoValor02){
		valor02 = novoValor02;
	}

	public int getValor02(){
		return valor02;
	}


	public void setValor03(int novoValor03){
		valor03 = novoValor03;
	}

	public int getValor03(){
		return valor03;
	}

	
	public Double media(){
		return ((valor01 +valor02+ valor03)/3.0);	
	}







}