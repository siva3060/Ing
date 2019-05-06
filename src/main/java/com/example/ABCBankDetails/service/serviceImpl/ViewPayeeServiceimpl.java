package com.example.ABCBankDetails.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.ViewPayee;
import com.example.ABCBankDetails.repository.Viewpayeerepository;
import com.example.ABCBankDetails.service.ViewPayeeService;

@Service
public class ViewPayeeServiceimpl implements ViewPayeeService {
    @Autowired
	Viewpayeerepository viewpayeerepository; 
	
	@Override
	public List<ViewPayee> getAddViewPayee(Long accountNoSource) {
		
		return  viewpayeerepository.findByAccountNoSource(accountNoSource);
	}
	}
	
	

