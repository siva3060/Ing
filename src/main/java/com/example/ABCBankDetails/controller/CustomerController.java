package com.example.ABCBankDetails.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCBankDetails.dto.PayeeAddRequestDTO;
import com.example.ABCBankDetails.service.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {


	@Autowired
	CustomerService customerService;

	@Autowired
	ValidationService validationService;

	//Method : create a new customer 
	//	Check weather the customer based on the id/account number
	//	If exist
	//		-display customer exist
	//	If not 
	//		-create new customer
	@PostMapping("/createCustomer")
	public String createNewCustomer(CustomerCreateRequest custCreateRequest){
		boolean customerExist = true;
		String createCustResponse = "Customer Exist already exist";
		customerExist = validationService.customerExist(custCreateRequest.getCusAcctNum());

		if(customerExist.boolean.isFalse()){
			customerService.createCustomer(custCreateRequest);
			createCustResponse = "New Customer Created with A/c No"+custCreateRequest.getCustAcctNum();
		}
		return createCustResponse;
		//End of method createCustomer	
	}

	//end of CustomerController Class
}

