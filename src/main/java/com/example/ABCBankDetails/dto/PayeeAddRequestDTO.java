
package com.example.ABCBankDetails.dto;


import java.io.Serializable;

public class PayeeAddRequestDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int customerId;
	private int payeeId;
	
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Long getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}
	
}
