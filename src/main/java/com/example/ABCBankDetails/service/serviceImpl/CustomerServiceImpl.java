package com.example.ABCBankDetails.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.CreateCustRequest;
import com.example.ABCBankDetails.model.Customer;
import com.example.ABCBankDetails.repository.CustomerRepository;
import com.example.ABCBankDetails.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {
	
 @Autowired
 CustomerRepository customerRepository;
 

 public boolean createCustomer(CreateCustRequest createCustRequest){
	 
	 Customer newCustomer = new Customer();
	 newCustomer.setCustomerAccountNumber(createCustRequest.getCustomerAccNum());
	 newCustomer.setCurrentBalance(0.00);
	 newCustomer.setCustomerAddress(createCustRequest.getCustAddress());
	 newCustomer.setCustomerEmail(createCustRequest.getCustAddress());
	 newCustomer.setCustomerName(createCustRequest.getCustName());
	 newCustomer.setCustomerPassword(createCustRequest.getCustPassword());
	 customerRepository.save(newCustomer);
	 return true;
 }



}
