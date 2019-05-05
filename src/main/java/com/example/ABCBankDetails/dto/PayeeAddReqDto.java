package com.example.ABCBankDetails.dto;

public class PayeeAddReqDto {
	
	private int accountNoSource;
	private int accountNoTarget;
	private String nickNameTarget;
	private String emailSource;
	public int getAccountNoSource() {
		return accountNoSource;
	}
	public void setAccountNoSource(int accountNoSource) {
		this.accountNoSource = accountNoSource;
	}
	public int getAccountNoTarget() {
		return accountNoTarget;
	}
	public void setAccountNoTarget(int accountNoTarget) {
		this.accountNoTarget = accountNoTarget;
	}
	public String getNickNameTarget() {
		return nickNameTarget;
	}
	public void setNickNameTarget(String nickNameTarget) {
		this.nickNameTarget = nickNameTarget;
	}
	public String getEmailSource() {
		return emailSource;
	}
	public void setEmailSource(String emailSource) {
		this.emailSource = emailSource;
	}
}
