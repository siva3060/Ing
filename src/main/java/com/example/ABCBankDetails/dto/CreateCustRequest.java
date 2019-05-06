package com.example.ABCBankDetails.dto;

import java.io.Serializable;

import lombok.Data;



public class CreateCustRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long customerAccNum;
	private String custEmail;
	private String custName;
	private String custPassword;
	private String custAddress;
	
	
	public Long getCustomerAccNum() {
		return customerAccNum;
	}
	public void setCustomerAccNum(Long customerAccNum) {
		this.customerAccNum = customerAccNum;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPassword() {
		return custPassword;
	}
	public void setCustPassword(String custPassword) {
		this.custPassword = custPassword;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
}
