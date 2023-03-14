public class Converter {
	public static void main(String[] args){
		Conversao conversao01 = new Conversao();

		conversao01.setGaloes(5.0);
		
		System.out.println("Valor Convertido: "+conversao01.doIT());

	}
}