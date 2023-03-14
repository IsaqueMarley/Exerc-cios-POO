public class AppNotas {
	public static void main (String[] args){
		Aluno a = new Aluno();

		a.setNome("ISAQUE");
		a.setMatricula("2021800023653");
		a.setNota1(7.0);
		a.setNota2(7.0);
		a.setNota3(7.0);

		System.out.println("Nome = "+ a.getNome());
		System.out.println("Média = "+a.media());
	}
}

