package com.hcl.vewpayee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hcl.vewpayee.entity.ViewPayee;
import com.hcl.vewpayee.repository.Viewpayeerepository;

@Service
public class ViewPayeeServiceimpl implements ViewPayeeService {
    @Autowired
	Viewpayeerepository viewpayeerepository; 
	
	@Override
	public List<ViewPayee> getAddViewPayee(Long accountNoSource) {
		
		return  viewpayeerepository.findByAccountNoSource(accountNoSource);
	}
	}
	
	

