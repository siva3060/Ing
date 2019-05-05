package com.example.ABCBankDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	private Long customerAccountNumber;
	private String customerName;
	private String customerEmail;
	private String customerPassword;
	private double currentBalance;
	private String customerAddress;
	
	
}
