public class Aluno {
	private String nome;
 	private String matricula;
 	private double nota1;
	private double nota2;
	private double nota3;

	public void setNome(String novoNome){
		nome = novoNome;
	}
	
	public String getNome(){
		return nome;
	}

	public void setMatricula(String novaMatricula){
		matricula = novaMatricula;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setNota1( Double novaNota1){
		nota1 = novaNota1;
	}
	
	public Double getNota1(){
		return nota1;
	}
		
	public void setNota2(Double novaNota2){
		nota2 = novaNota2;
	}

	public Double getNota2(){
		return nota2;
	}

	public void setNota3( Double novaNota3){
		nota3 = novaNota3;
	}

	public Double getNota3(){
		return nota3;
	}

	public double media(){
		return(nota1+nota2+nota3)/3.0;
	}

}
