package com.example.ABCBankDetails.service;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.CreateCustRequest;


@Service
public interface ManagerService {

	boolean createCustomer(CreateCustRequest custCreateRequest);
	public String searchCustomerByName(String accountName);
	public String searchCustomerByAccountNumber(Long accountNumber);

}
