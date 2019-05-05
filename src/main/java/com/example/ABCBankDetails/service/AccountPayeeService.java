package com.example.ABCBankDetails.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.CustomerPayees;
@Service
public interface AccountPayeeService {

	 public List<CustomerPayees> getAddViewPayee(Long accountNumber);

}
