public class LerSalario{
	private double salario;
	private double aumento;
	
	public void setSalario(Double novoSalario){
		salario = novoSalario;
	}

	public Double getSalario(){
		return salario;
	}
	


	public void setAumento(Double novoAumento){
		aumento = novoAumento;
	}

	public Double getAumento(){
		return aumento;
	}
	

	public Double valorSalario(){
		return salario;
	}

	public Double aumentoSalario(){
		return salario + (salario*aumento);
	}
	
	public Double salarioNovo(){
		return salario + (salario*aumento);
	}


}