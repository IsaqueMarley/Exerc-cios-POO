public class Livro{
  private String code;
  private String name;
  private int amount;

  public Livro(String code, String name, int amount){
    this.code = code;
    this.name = name;
    this.amount = amount;
  }

  public void setCode(String code){
    code = code;
  }
  public String getCode(){
    return code;
  }
  public void setName(String name){
    name = name;
  }
  public String getName(){
    return name;
  }
  public void setAmount(int amount){
    amount = amount;
  }
  public int getAmount(){
    return amount;
  }

  public void exibirExemplares(){
    System.out.println("Exitem "+this.amount+" exemplares do livro "+this.name); 
  }

 
}