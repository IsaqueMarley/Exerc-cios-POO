public class Aluno{
  public static void main(String[] args){
     Media aluno = new Media();

     aluno.setNota1(0);
     aluno.setNota2(8);
     aluno.setNota3(8);

     if (aluno.calcularMedia() >= 7){
	System.out.println("APROVADO");
     }else if (aluno.calcularMedia() >= 3) {
	System.out.println("Prova Final");
     }else{
	System.out.println("Reprovado");
     }

  }
}