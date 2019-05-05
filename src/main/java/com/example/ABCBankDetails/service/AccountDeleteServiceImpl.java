package com.example.ABCBankDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.repository.AccountPayeeRepository;



@Service
public class AccountDeleteServiceImpl implements AccountDeleteService{
	
    @Autowired
	AccountPayeeRepository accountPayeeRepository;

	@Override
	public void getDeletePayee(int accountNoSource,int accountNoTarget) {
		// TODO Auto-generated method stub
		accountPayeeRepository.deleteByAccountNoSourceAndAccountNoTarget(accountNoSource, accountNoTarget);
		
	}
	

}
