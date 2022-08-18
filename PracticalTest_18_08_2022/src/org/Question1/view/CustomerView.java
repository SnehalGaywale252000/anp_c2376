package org.Question1.view;
import org.Question1.model.*;
import org.Question1.service.*;
import org.Question1.service.CustomerService;
public class CustomerView {

	public static void main(String[] args) {
		
		CustomerService csObj= new CustomerService();
		Customer cObj= new Customer(11,"snehal",11);
		boolean eligible;
		// System.out.println(cObj.getAge());
		eligible= csObj.checkEligibility(cObj);
		 if(eligible) {
			 System.out.println("you are eligible to voting");
		 }
		
		 else{
			 System.out.println("you are not eligible to voting");
		 }
			

	}

}
