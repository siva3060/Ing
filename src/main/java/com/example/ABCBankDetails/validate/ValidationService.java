package com.example.ABCBankDetails.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.Customer;
import com.example.ABCBankDetails.repository.CustomerRepository;

@Service
public class ValidationService{


	@Autowired
	CustomerRepository customerRepository;


	public boolean validateCustomerAccountNumber(Long accountNumber){		
		boolean customerExist = false;
		Customer validCustomer = new Customer();
		validCustomer = customerRepository.findByCustomerAccountNumber(accountNumber);
		System.out.println(validCustomer.toString());
		if(validCustomer != null){
			customerExist = true;
		}

		return customerExist;
	}
	
	public boolean validateCustomerName(String accountName){
		 boolean accountExist = false;
		 Customer validCustomer = customerRepository.findByCustomerName(accountName);
		 if(validCustomer != null) {
			 accountExist = true;
		 }
		 return accountExist;
		
	}
}
