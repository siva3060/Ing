package com.example.ABCBankDetails.service;

import com.example.ABCBankDetails.dto.CreateCustRequest;



public interface ManagerService {

	boolean createCustomer(CreateCustRequest custCreateRequest);
	public String searchCustomerByName(String accountName);
	public String searchCustomerByAccountNumber(Long accountNumber);

}
