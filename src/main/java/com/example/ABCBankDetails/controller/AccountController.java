package com.example.ABCBankDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.ABCBankDetails.dto.PayeeAddReqDto;
import com.example.ABCBankDetails.dto.PayeeAddResDto;
import com.example.ABCBankDetails.repository.AccountPayee;
import com.example.ABCBankDetails.service.AccountPayeeService;



import com.example.ABCBankDetails.service.AccountDeleteService;

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
	 public List<AccountPayee> getAddViewPayee(@PathVariable Long accountNumber){
		List<AccountPayee> resResult= new ArrayList();
	       resResult = accountPayeeService.getAddViewPayee(accountNumber);  
	    return 	resResult;
	
}}
