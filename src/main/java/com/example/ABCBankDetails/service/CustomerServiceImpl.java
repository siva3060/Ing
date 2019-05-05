package com.example.ABCBankDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.PayeeAddRequestDTO;
import com.example.ABCBankDetails.model.Customer;
import com.example.ABCBankDetails.model.CustomerPayees;
import com.example.ABCBankDetails.repository.CustomerRepository;
import com.example.ABCBankDetails.repository.PayeeRepository;


@Service
public class CustomerServiceImpl implements CustomerService {
	
 @Autowired
 PayeeRepository payeeRepository;
 
 @Autowired
 CustomerRepository customerRepository;
 

 public boolean addPayeeToAccount(PayeeAddRequestDTO payeeAddRequestDto){
	 boolean emailValidation = true;
	 boolean userCreated = false;
	 //code for validation from the email has to go here
	 //so iam assuming the validationTrue
	 if(emailValidation) {
		 CustomerPayees customerPayee = new CustomerPayees();
		 customerPayee.setCustomerId(payeeAddRequestDto.getCustomerId());
		 customerPayee.setPayeeId(payeeAddRequestDto.getPayeeId());
		 payeeRepository.save(customerPayee);
		 userCreated = true;
	 }
	 
	 return userCreated;
 }


@Override
public boolean validatingAccounts(Long payeeId) {
	
		boolean validCustomer = false;
		
		Customer customer = customerRepository.findByCustomerId(payeeId);
		if(customer != null) {
			validCustomer = true;
		}
		return validCustomer;	
}

}

