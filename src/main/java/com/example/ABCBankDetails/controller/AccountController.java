package com.example.ABCBankDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.ABCBankDetails.service.AccountDeleteService;

@RestController
@RequestMapping("/bankapp")
public class AccountController {
	
	@Autowired
	AccountDeleteService accountDeleteService;
	
	@GetMapping("/deletePayee/{accountNoSource}/{accountNoTarget}/{email}")
	public ResponseEntity<String> getDeletedPayee(@PathVariable int accountNoSource,int accountNoTarget ,String email){
		
		
		String message = accountDeleteService.getDeletePayee(accountNoSource,accountNoTarget,email);		
		return new ResponseEntity<String>(message , HttpStatus.ACCEPTED);
	}

}
