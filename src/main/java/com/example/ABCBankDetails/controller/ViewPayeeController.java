package com.example.ABCBankDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABCBankDetails.model.ViewPayee;
import com.example.ABCBankDetails.service.ViewPayeeService;

@RestController
@RequestMapping("/bank")
public class ViewPayeeController {
	@Autowired
	ViewPayeeService viewPayeeService;
	
	@GetMapping("/viewPayee/{accountNoSource}")
	 public List<ViewPayee> getAddViewPayee(@PathVariable(value="accountNoSource") Integer accountNoSource){
		//List<AccountPayee> resResult= new ArrayList();
		return viewPayeeService.getAddViewPayee(Long.valueOf(accountNoSource));  
	    //return 	resResult;
	}
}
