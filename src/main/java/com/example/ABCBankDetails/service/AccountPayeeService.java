package com.example.ABCBankDetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.AccountPayee;
@Service
public interface AccountPayeeService {

	 public List<AccountPayee> getAddViewPayee(Long accountNumber);

}
