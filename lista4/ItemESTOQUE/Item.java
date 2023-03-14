public class Item{
  private String code;
  public Product product;
  private int amountSold;


  public Item(String code, Product product, int amountSold){
    this.code = code;
    this.product = product;
    this.amountSold = amountSold;    
  }

  public void setCode(String code){
    this.code = code;
  }
  public String getCode(){
    return code;
  }
  public void setPoduct(Product product){
    this.product = product;
  }
  public Product getProduct(){
    return product;
  }
  public void setAmountSold(int amountSold){
    this.amountSold = amountSold;
  }
  public int getAmountSold(){
    return amountSold;
  }
  public void exibirItem(){
    System.out.println(" ");
  }
   public void sales(){
	System.out.println("Quantidade vendida do produto "+getCode() +": "+getAmountSold());
	System.out.println("==========================================");
  }

  public void afterSales(){
	
 	System.out.println("Quantidade após vendas do produto "+getCode()+": "+(product.getAmount()- getAmountSold()));
	System.out.println("==========================================");
  }
}