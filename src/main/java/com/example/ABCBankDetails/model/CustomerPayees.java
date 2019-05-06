package com.example.ABCBankDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerPayees {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerPayees;
	private Long customerId;
	private Long PayeeId;
	
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getPayeeId() {
		return PayeeId;
	}
	public void setPayeeId(Long payeeId) {
		PayeeId = payeeId;
	}
	
	
}
