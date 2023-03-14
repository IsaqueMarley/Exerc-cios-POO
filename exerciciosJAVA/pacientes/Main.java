public class Main{
	public static void main (String[] args){
		Pacientes paciente = new Pacientes();
	
		paciente.setNome("JOAO");
		paciente.setSexo("F");
		paciente.setPeso(75.9);
		paciente.setIdade(45);
		paciente.setAltura(1.75);

		System.out.println("result: "+ paciente.valorConsulta());
	}
}