public class AreaCirc{
	public static void main(String[] args){
		LerRaio value01 = new LerRaio();
		LerRaio value02 = new LerRaio();

		value01.setRaio(1.0);
		value02.setRaio(5.0);


		System.out.println("VALOR DO AREA DO CIRC com raio 1: "+value01.areaCirculo());
		System.out.println("VALOR DO AREA DO CIRC com raio 5: "+value02.areaCirculo());
	
	}
}