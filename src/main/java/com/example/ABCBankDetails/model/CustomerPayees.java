package com.example.ABCBankDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CustomerPayees{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long customerPayeeId;
	private Long customerId;
	private Long payeeId;
	
	
	public Long getCustomerPayeeId() {
		return customerPayeeId;
	}
	public void setCustomerPayeeId(Long customerPayeeId) {
		this.customerPayeeId = customerPayeeId;
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
