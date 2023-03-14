public class PesoLua{
	public static void main(String[] args){
		GravidadeLua pessoa01 = new GravidadeLua();
		GravidadeLua pessoa02 = new GravidadeLua();

		pessoa01.setPeso(100.0);
		pessoa02.setPeso(70.0);

		System.out.println(pessoa01.pesoNaLua()+"Kg na lua");
		System.out.println(pessoa02.pesoNaLua()+"Kg na lua");
	}
}