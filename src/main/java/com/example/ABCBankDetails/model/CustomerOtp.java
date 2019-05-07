package com.example.ABCBankDetails.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CustomerOtp {
	@Id
	private int otpId;
	private int customerOtp;
	private int customer;

}
