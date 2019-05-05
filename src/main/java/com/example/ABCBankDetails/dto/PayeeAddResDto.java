package com.example.ABCBankDetails.dto;

public class PayeeAddResDto {

	private Long accountNoSource;
	private Long accountNoTarget;
	private String nickNameTarget;
	private String emailSource;
	private String message;
	public Long getAccountNoSource() {
		return accountNoSource;
	}
	public void setAccountNoSource(Long accountNoSource) {
		this.accountNoSource = accountNoSource;
	}
	public Long getAccountNoTarget() {
		return accountNoTarget;
	}
	public void setAccountNoTarget(Long accountNoTarget) {
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
