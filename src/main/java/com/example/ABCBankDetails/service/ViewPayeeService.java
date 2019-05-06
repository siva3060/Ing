package com.example.ABCBankDetails.service;

import java.util.List;

import com.example.ABCBankDetails.model.ViewPayee;

public interface ViewPayeeService {
	public List<ViewPayee> getAddViewPayee(Long accountNoSource);
}
