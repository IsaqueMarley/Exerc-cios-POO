public class Product{
  private String name;
  private Double priceCust;
  private Double priceSold;
 
  public Product(String name,Double priceCust,Double priceSold){
   this.name = name;
   this.priceCust = priceCust;
   this.priceSold = priceSold;
  }

  public void setPriceSold(Double priceSold){
    if (priceSold >= priceCust) {
        this.priceSold = priceSold; 
    }else{
        System.out.println("Selling price is less than cost! ");
         } 
  }
  
  public Double profitMargin(){
    return (priceSold - priceCust);
  }

  public void getProfitMarginPocent(){
    System.out.println("porcentagem de lucro "+ (((priceSold - priceCust)/100)*priceCust) +"%" );
  }

  public void exibirItem(){
    System.out.println(this.name +" "+ this.priceCust+" "+ this.priceSold);	
  }


}