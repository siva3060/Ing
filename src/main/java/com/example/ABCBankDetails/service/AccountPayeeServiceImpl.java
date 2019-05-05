package com.example.ABCBankDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.AccountPayee;
import com.example.ABCBankDetails.model.CustomerPayees;
import com.example.ABCBankDetails.repository.PayeeRepository;


@Service
public class AccountPayeeServiceImpl implements AccountPayeeService {

	@Autowired
	AccountPayee accountPayee;
	
	@Autowired
	PayeeRepository payeeRepository;
	
	@Override
	public List<CustomerPayees> getAddViewPayee(Long accountNumber) {
		 return payeeRepository.findAll();
		 }
		
		
	}


