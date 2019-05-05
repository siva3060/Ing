
package com.example.ABCBankDetails.dto;


import java.io.Serializable;

public class PayeeAddRequestDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long customerId;
	private Long payeeId;
	
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(Long payeeId) {
		this.payeeId = payeeId;
	}
	
}
