public class Valores{
  private float valor1;	
  private float valor2;
  private float valor3;

  public void setvalor1(float novavalor1){
     valor1 = novavalor1;
  }
  public float getvalor1(){
     return valor1;
  }

  public void setvalor2(float novavalor2){
     valor2 = novavalor2;
  }
  public float getvalor2(){
     return valor2;
  }

  public void setvalor3(float novavalor3){
     valor3 = novavalor3;
  }
  public float getvalor3(){
     return valor3;
  }

  public void ordemDecrescente(){
    System.out.print("ORDEM DECRESCENTE: ");
    if (valor1 > valor2 & valor2 > valor3){
	System.out.println(valor1+" "+valor2+" "+valor3);
    }if (valor1 > valor2 & valor2 < valor3){
	System.out.println(valor1+" "+valor3+" "+valor2);
    }if (valor2 > valor1 & valor1 > valor3){
	System.out.println(valor2+" "+valor1+" "+valor3);
    }if (valor2 > valor1 & valor2 < valor3){
	System.out.println(valor2+" "+valor3+" "+valor1);
    }if (valor3 > valor1 & valor1 > valor2){
	System.out.println(valor3+" "+valor1+" "+valor2);
    }if (valor3 > valor1 & valor1 < valor2){
	System.out.println(valor3+" "+valor2+" "+valor1);
    }
	
  }


  public void ordemCrescente(){
    System.out.print("ORDEM CRESCENTE: ");
    if (valor1 < valor2 & valor2 < valor3){
	System.out.println(valor1+" "+valor2+" "+valor3);
    }if (valor1 < valor2 & valor2> valor3){
	System.out.println(valor1+" "+valor3+" "+valor2);
    }if (valor2 < valor1 & valor1 < valor3){
	System.out.println(valor2+" "+valor1+" "+valor3);
    }if (valor2 < valor1 & valor2 >  valor3){
	System.out.println(valor2+" "+valor3+" "+valor1);
    }if (valor3 < valor1 & valor1 < valor2){
	System.out.println(valor3+" "+valor1+" "+valor2);
    }if (valor3 < valor1 & valor1 > valor2){
	System.out.println(valor3+" "+valor2+" "+valor1);
    }
	
  }

}