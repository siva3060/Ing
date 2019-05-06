package com.example.ABCBankDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCBankDetails.dto.PayeeAddRequestDto;
import com.example.ABCBankDetails.service.CustomerService;
import com.example.ABCBankDetails.validate.ValidationService;

@RestController
@RequestMapping("/CustomerApi")
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@Autowired
	ValidationService validationService;
	
	@PostMapping("/Addpayee")
	public String addPayee(PayeeAddRequestDto payeeAddRequestDto){

		boolean payeeExist = false;
		String addPayeeMsg = null;

		
		//we will validate weather the accounts exists or not 
		payeeExist = validationService.validateCustomerAccountNumber(payeeAddRequestDto.getPayeeId());
		//If exist return method with string or some error
		if(payeeExist){
			
			addPayeeMsg = customerService.getAddPayeeOTP(payeeAddRequestDto.getCustomerEmail());
			/*
			 * if(customerService.addPayeeToAccount(payeeAddRequestDto)) {
			 * 
			 * addPayeeMsg = "A payee has been added to your account"; } else { addPayeeMsg=
			 * "Unable to add requested payee"; }
			 */
		}
		return addPayeeMsg;
	//End of method addPayee	
	}
	
	
	//end of CustomerController Class
}

