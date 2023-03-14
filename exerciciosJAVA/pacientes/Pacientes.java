public class Pacientes{
	private String nome;
	private String sexo;
	private Double peso;
	private int idade;
	private Double altura;

	

	public void setNome(String novoNome){
		nome = novoNome;}
	public String getNome(){
		return nome;}

	public void setSexo(String novoSexo){
		sexo = novoSexo;}
	public String getSexo(){
		return sexo;}

	public void setPeso(Double novoPeso){
		peso = novoPeso;}
	public Double getPeso(){
		return peso;}

	public void setIdade(int novaIdade){
		idade = novaIdade;}
	public int getIdade(){
		return idade;}

	public void setAltura(Double novaAltura){
		altura = novaAltura;}
	public Double getAltura(){
		return altura;}


	public Double valorConsulta(){
		return (altura*peso + idade);}
	
}
	