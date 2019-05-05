package com.example.ABCBankDetails.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ABCBankDetails.dto.PayeeAddReqDto;
import com.example.ABCBankDetails.dto.PayeeAddResDto;
import com.example.ABCBankDetails.repository.AccountPayee;
import com.example.ABCBankDetails.service.AccountPayeeService;


@RestController
@RequestMapping("\bankapp")


public class AccountController {
	@Autowired
	AccountPayeeService accountPayeeService;
	


	@GetMapping("/viewPayee")
	 public List<AccountPayee> getAddViewPayee(@PathVariable Long accountNumber){
		List<AccountPayee> resResult= new ArrayList();
	       resResult = accountPayeeService.getAddViewPayee(accountNumber);  
	    return 	resResult;
	
}}
