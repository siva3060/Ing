package com.example.ABCBankDetails.dto;

import java.io.Serializable;

public class PayeeAddRequestDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//class with give the details of the customer of the bank to be added
	private Long customerId;
	private String customerEmail;
	private Long payeeId;
	

	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
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
