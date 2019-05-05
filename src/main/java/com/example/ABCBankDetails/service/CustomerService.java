package com.example.ABCBankDetails.service;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.PayeeAddRequestDTO;


@Service
public interface CustomerService {

	boolean addPayeeToAccount(PayeeAddRequestDTO payeeAddRequestDto);

	boolean validatingAccounts(Long payeeId);
}
