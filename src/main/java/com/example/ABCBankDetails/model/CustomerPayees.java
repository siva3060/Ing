package com.example.ABCBankDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CustomerPayees{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerPayeeId;
	private int customerId;
	private int payeeId;
	
	
	public int getCustomerPayeeId() {
		return customerPayeeId;
	}
	public void setCustomerPayeeId(int customerPayeeId) {
		this.customerPayeeId = customerPayeeId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getPayeeId() {
		return payeeId;
	}
	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}
	
	
}
