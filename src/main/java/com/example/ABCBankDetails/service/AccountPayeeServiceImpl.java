package com.example.ABCBankDetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ABCBankDetails.repository.PayeeRepository;
import com.example.ABCBankDetails.dto.*;
import com.example.ABCBankDetails.model.*;


@Service
public class AccountPayeeServiceImpl implements AccountPayeeService {

	@Autowired
	AccountPayee accountPayee;
	
	@Autowired
	PayeeRepository payeeRepository;
	
	@Override
	public List<AccountPayee> getAddViewPayee(Long accountNumber) {
		 return payeeRepository.findAll();
		 }
		
		
	}


