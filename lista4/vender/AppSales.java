import java.util.Scanner;
public class AppSales{
  public static void main (String[] args){
 
    Scanner myObj = new Scanner (System.in); 
    
    String userName = myObj.nextLine(); // ler o input
    Double priceCust = myObj.nextDouble();
    Double priceSold = myObj.nextDouble();
    
    Product product01 = new Product(userName,priceCust,priceSold);
    product01.exibirItem(); 
    
    product01.setPriceSold(priceSold);
    product01.getProfitMarginPocent();
   // Product product02 = new Product(userName2,priceCust,priceSold);
    //product02.exibirItem();


   
  }
}