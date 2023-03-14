public class Product{
  private String code;
  private String name;
  private int amount;
  private float price;

  public Product(String code, String name, int amount,float price){
    this.code = code;
    this.name = name; 
    this.amount = amount;  
    this.price = price;  
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

  public void setPrice(float price){
    price = price;
  }
  public float getPrice(){
    return price;
  }

  public void stock(){
	System.out.println("Quantidade do produto "+getName() +": "+getAmount());
	System.out.println("==========================================");	
  }




}