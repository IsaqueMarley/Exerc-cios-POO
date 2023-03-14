public class Conversao{
	public static void main (String[] args){
		Horas hora = new Horas();

		hora.setHoras(10);
		hora.setMinutos(10);

		System.out.println(" A VARIALVEL HORA CONVERTIDA EM MINUTOS: "+hora.horaEmMinutos());
		System.out.println(" O total de minutos convertidos em segundos: "+hora.totalDeSegundos());
		System.out.println(" Os minutos digitados mais a conversão anterior: "+hora.totalDeMinutos());
	}
}