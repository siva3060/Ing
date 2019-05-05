package com.example.ABCBankDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCBankDetails.model.CustomerPayees;
import com.example.ABCBankDetails.service.AccountDeleteService;
import com.example.ABCBankDetails.service.AccountPayeeService;

@RestController
@RequestMapping("\bankapp")


public class AccountController {
	@Autowired
	AccountPayeeService accountPayeeService;
	
	
	@Autowired
	AccountDeleteService accountDeleteService;
	
	@GetMapping("/deletePayee")
	public ResponseEntity<String> getDeletedPayee(@PathVariable int accountNoSource,int accountNoTarget ){
		
		
		accountDeleteService.getDeletePayee(accountNoSource,accountNoTarget);		
		return new ResponseEntity<String>("Successfully get the deleted records", HttpStatus.ACCEPTED);
	}

	@GetMapping("/viewPayee")
	 public List<CustomerPayees> getAddViewPayee(@PathVariable Long accountNumber){
		List<CustomerPayees> resResult= new ArrayList();
	       resResult = accountPayeeService.getAddViewPayee(accountNumber);  
	    return 	resResult;
	
}}
