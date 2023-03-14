public class Inverter{
	public static void main(String[] args){
		Ler inversao = new Ler();
	
		inversao.setNumber01(48);
		inversao.setNumber02(3);
		inversao.setNumber03(8);
		
		System.out.println("Ordem Inversa: "+ inversao.inverte3());
		
	}
}