package com.example.ABCBankDetails.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.model.AccountPayee;
import com.example.ABCBankDetails.repository.AccountPayeeRepository;



@Service
public class AccountDeleteServiceImpl implements AccountDeleteService{
	
    @Autowired
	AccountPayeeRepository accountPayeeRepository;
    @Autowired
	public JavaMailSender emailSender;

	@Override
	public String getDeletePayee(int accountNoSource,int accountNoTarget,String email) {
		// TODO Auto-generated method stub
		AccountPayee result = new AccountPayee();
		String otp = null;
		result = accountPayeeRepository.getByAccountNoSourceAndAccountNoTarget(accountNoSource, accountNoTarget);
		if(result.getAccountNoTarget() == accountNoTarget ) {
			try{
				sendingMailforDelete(email);
					}catch(Exception e){
				System.out.println(e);
			}
		
		} else {
			return "Target account Id not present";
		}		
		
		return "OTP has been sent successfully to your mail";
		
	}
	
	public void sendingMailforDelete(String email) throws Exception{
		SimpleMailMessage message = new SimpleMailMessage();
		Random rand = new Random();
		String otp = String.format("%04d", rand.nextInt(10000));
		message.setTo(email);
		message.setSubject("OTP for Delete Payee");
		message.setText("Please use this OTP for delete Payee : "+otp);
		emailSender.send(message);
	}


}
