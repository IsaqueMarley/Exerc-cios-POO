public class Conversao{
	public static void main(String[] args){
		Kw casa = new Kw();
		
		casa.setKw(152.2);
		casa.setSalario(1200.0);
		casa.setDesconto(0.15);
	
		System.out.println("O valor do Kw: "+ casa.valorKw());
		System.out.println("O valor a ser pago por essa residência: "+ casa.valorPagar());
		System.out.println("O valor a ser pago com desconto de 15%: "+ casa.valorComDesconto());
	}
}