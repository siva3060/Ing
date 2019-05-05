package com.example.ABCBankDetails.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.Customer;
import com.example.ABCBankDetails.repository.CustomerRepository;

@Service
public class ValidationService{


	@Autowired
	CustomerRepository customerRepository;


	public boolean customerExist(Long accountNum){
		
		boolean customerExist = false;
		Customer validCustomer = new Customer();
		validCustomer = customerRepository.findByCustomerAccountNumber(accountNum);
		if(validCustomer != null){
			customerExist = true;
		}

		return customerExist;
	}
}
