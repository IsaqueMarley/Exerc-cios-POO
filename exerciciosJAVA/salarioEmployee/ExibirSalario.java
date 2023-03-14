public class ExibirSalario{
	public static void main(String[] args){
		LerSalario salario= new LerSalario();
		LerSalario salario2 = new LerSalario();

		salario.setSalario(1200.0);
		salario.setAumento(0.25);
		
		System.out.println("O VALOR DO SALÁRIO EH: R$ "+ salario.valorSalario()+" Reais.");
		System.out.println("O VALOR DO SALÁRIO COM AUMENTO EH: R$ "+ salario.aumentoSalario()+" Reais.");
		System.out.println("O VALOR DO SALÁRIO ATUAL EH: R$ "+ salario.salarioNovo()+" Reais.");
	}
}