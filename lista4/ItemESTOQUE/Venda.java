public class Venda{
  public static void main(String[] args){

    Product  product01 = new Product ("001","CANETA", 5888,1.25f);
    Product  product02 = new Product ("002","BORRACHA", 8000,1.75f);
    
    product01.stock();
    product02.stock();
 
    Item item01 = new Item("001",product01,55);
    Item item02 = new Item("002",product02,11);
    //Item item03 = new Item("003",);


    item01.sales();
    item02.sales();
	
    item01.afterSales();
    item02.afterSales();

    
  }

  


}