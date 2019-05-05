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
	//Method : Adding a payee
	// This method will add an payee to the PayeeTable
	// Only after confirmation of accounts exists or not
	@PostMapping("/Addpayee")
	public String addPayee(PayeeAddRequestDTO payeeAddRequestDto){

		boolean payeeExist = false;
		String addPayeeMsg = null;

		
		//we will validate weather the accounts exists or not 
		payeeExist = customerService.validatingAccounts(payeeAddRequestDto.getPayeeId());
		//If exist return method with string or some error
		if(payeeExist){
			if(customerService.addPayeeToAccount(payeeAddRequestDto)) {
				addPayeeMsg =  "A payee has been added to your account";
			}
			else {
				addPayeeMsg=  "Unable to add requested payee";
			}
		}
		return addPayeeMsg;
	//End of method addPayee	
	}
	//end of CustomerController Class
}

