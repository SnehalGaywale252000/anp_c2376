package org.example.service;
import org.example.model.Product;
//import org.example.model.Product;
public class ProductService {
	
	

  public void increasePrice(Product p)
 
  {
     double newprice;
	 
	
	 System.out.println(p.getPrice());
	 newprice=p.getPrice()+100;
   
 
     System.out.println("newPrice"+newprice);
 
	
  }
}
