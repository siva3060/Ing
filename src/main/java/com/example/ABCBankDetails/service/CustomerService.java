package com.example.ABCBankDetails.service;

import com.example.ABCBankDetails.dto.PayeeAddRequestDto;

public interface CustomerService {
	
	public String getAddPayeeOTP(String email);
	boolean addPayeeToAccount(PayeeAddRequestDto payeeAddRequestDto);
	//some method name afte validation
	public boolean addPayee(PayeeAddRequestDto payeeAddRequestDto);
}
