public class Media{
  private float nota1;	
  private float nota2;
  private float nota3;

  public void setNota1(float novaNota1){
     nota1 = novaNota1;
  }
  public float getNota1(){
     return nota1;
  }

  public void setNota2(float novaNota2){
     nota2 = novaNota2;
  }
  public float getNota2(){
     return nota2;
  }

  public void setNota3(float novaNota3){
     nota3 = novaNota3;
  }
  public float getNota3(){
     return nota3;
  }


  public float calcularMedia(){
    return (nota1+nota2+nota3)/3;
  }

}