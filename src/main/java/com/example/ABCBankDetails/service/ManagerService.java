package com.example.ABCBankDetails.service;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.CreateCustRequest;


@Service
public interface ManagerService {

	boolean createCustomer(CreateCustRequest custCreateRequest);
	String  searchCustomerAccountNumber(Long accountNumber);
	String  searchCustomerName(String accountName);
	
}
