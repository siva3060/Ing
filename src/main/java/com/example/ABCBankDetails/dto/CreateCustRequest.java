package com.example.ABCBankDetails.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class CreateCustRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long customerAccNum;
	private String custEmail;
	private String custName;
	private String custPassword;
	private double intialBalance;
	private String custAddress;
}
