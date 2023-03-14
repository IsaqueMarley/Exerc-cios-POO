public class Media{
	public static void main(String[] args){
		LerValores values = new LerValores();
		
	
		values.setValor01(7);
		values.setValor02(7);
		values.setValor03(7);

		System.out.println("Avarge of three values: "+values.media());
	}	
}