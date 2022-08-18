package org.Question1.service;
import org.Question1.model.Customer;


public class CustomerService {

	public boolean checkEligibility(Customer cObj) {
		
		System.out.println(cObj.getAge());
		
		if(cObj.getAge()>=18) {
			
			return true;
		}
		else {
		return false;
		}
		
	}

	
}
