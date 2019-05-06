package com.example.ABCBankDetails.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.CreateCustRequest;
import com.example.ABCBankDetails.model.Customer;
import com.example.ABCBankDetails.repository.CustomerRepository;
import com.example.ABCBankDetails.service.ManagerService;


@Service
public class ManagerServiceImpl implements ManagerService {
	
 @Autowired
 CustomerRepository customerRepository;
 

 public boolean createCustomer(CreateCustRequest createCustRequest){
	 
	 Customer newCustomer = new Customer();
	 newCustomer.setCustomerAccountNumber(createCustRequest.getCustomerAccNum());
	 newCustomer.setCurrentBalance(0.00);
	 newCustomer.setCustomerAddress(createCustRequest.getCustAddress());
	 newCustomer.setCustomerEmail(createCustRequest.getCustEmail());
	 newCustomer.setCustomerName(createCustRequest.getCustName());
	 newCustomer.setCustomerPassword(createCustRequest.getCustPassword());
	 customerRepository.save(newCustomer);
	 return true;
 }

	public String searchCustomerByAccountNumber(Long accountNumber){
		String searchResponse = "Customer do not exist with this Number";
		Customer resultCustomer = customerRepository.findByCustomerAccountNumber(accountNumber);
		if(resultCustomer != null){
			searchResponse = resultCustomer.toString();
		}
			return searchResponse;
	}

	public String searchCustomerByName(String accountName){
		String searchResponse = "Customer do not exist with this Number";
		Customer resultCustomer = customerRepository.findByCustomerName(accountName);
		if(resultCustomer != null){
			searchResponse = resultCustomer.toString();
		}
		return searchResponse;
	}


}
