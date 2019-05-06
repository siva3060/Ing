package com.hcl.vewpayee.service;

import java.util.List;

import com.hcl.vewpayee.entity.ViewPayee;

public interface ViewPayeeService {
	public List<ViewPayee> getAddViewPayee(Long accountNoSource);
}
