public class Kw {
	private Double kw;
	private double salario;
	private double desconto;

	public void setKw(Double novoKw){
		kw = novoKw;}
	public Double getkw(){
		return kw;}
	

	public void setSalario(Double novoSalario){
		salario = novoSalario;}
	public double getSalario(){
		return salario;}
	
	
	public void setDesconto(Double novoDesconto){
		desconto = novoDesconto;}
	public double getDesconto(){
		return desconto;}


	public Double valorKw(){
		return kw;}

	public double valorPagar(){
		return (0.2 *salario * kw);}

	public double valorComDesconto(){
		//double total = (1/5*salario * kw);
		return  (0.2*salario * kw )- ((0.2*salario * kw)*desconto) ;}
	
	
	
}