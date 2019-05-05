package com.example.ABCBankDetails.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCBankDetails.dto.CreateCustRequest;
import com.example.ABCBankDetails.service.ManagerService;
import com.example.ABCBankDetails.validate.ValidationService;


@RestController
@RequestMapping("/customer")
public class ManagerController{


	@Autowired
	ManagerService managerService;

	@Autowired
	ValidationService validationService;

	//Method : create a new customer 
	//	Check weather the customer based on the id/account number
	//	If exist
	//		-display customer exist
	//	If not 
	//		-create new customer
	@PostMapping("/createCustomer")
	public String createNewCustomer(CreateCustRequest custCreateRequest){
		boolean customerExist = true;
		String createCustResponse = "Customer Exist already exist";
		customerExist = validationService.customerExist(custCreateRequest.getCustomerAccNum());

		if(customerExist == false){
			managerService.createCustomer(custCreateRequest);
			createCustResponse = "New Customer Created with A/c No"+custCreateRequest.getCustomerAccNum();
		}
		return createCustResponse;
		//End of method createCustomer	
	}


	//Method : seach by accountNumber
	// 	manger function to search an given  account number
	
	public String searchByAccountNumber(Long accoutNumber){

		boolean accountValidate = false;
		String searchResponse = "No user found with the customer account number";
		accountValidate = validationService.validateCustomerAccountNumber(accoutNumber);
		if(accountValidate){
			searchResponse = managerService.searchCustomerAccountNumber(accoutNumber);	
		}
		return searchResponse;

		//end of the method search by account name
	}
	
	//Method : search by accountName
	//	
	// 	manger function to search an given  account name

	public  String searchByAccountName(String accountName){
		boolean nameValidate = false;
		String searchResponse = "No user found with the customer name";
		nameValidate = validationService.validateCustomerName(accountName);
		if(nameValidate){
			searchResponse = ManagerService.searchCustomerAccountName(accountName);	
		}
		return searchResponse;

		//end of the method search by account name
	}
	//end of CustomerController Class
}

