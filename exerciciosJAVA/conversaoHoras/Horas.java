public class Horas{
	private int horas;
	private int minutos;

	public void setHoras(int novasHoras){
		horas = novasHoras;}

	public int getHoras(){
		return horas;}


	public void setMinutos(int novosMinutos){
		minutos = novosMinutos;}


	public int getMinutos(){
		return minutos;}

	
	public double horaEmMinutos(){
		return (horas*60);
	}

	public double totalDeMinutos(){
		return (horas*60)+ minutos;
	}

	public double totalDeSegundos(){
		return (horas*3600)+ minutos*60;
	}
	



}