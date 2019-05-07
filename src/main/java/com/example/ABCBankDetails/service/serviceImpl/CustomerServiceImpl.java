package com.example.ABCBankDetails.service.serviceImpl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.PayeeAddRequestDto;
import com.example.ABCBankDetails.model.CustomerPayees;
import com.example.ABCBankDetails.repository.PayeeRepository;
import com.example.ABCBankDetails.service.CustomerService;;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	 @Autowired
	 PayeeRepository payeeRepository;
	 
	 @Autowired
	 public JavaMailSender emailSender;
	 
	 public boolean addPayeeToAccount(PayeeAddRequestDto payeeAddRequestDto){
		 
		 
		 boolean emailValidation = true;
		 boolean userCreated = false;
		 
		 
		 //code for validation from the email has to go here
		 //so iam assuming the validationTrue
		 if(emailValidation) {
			 CustomerPayees customerPayee = new CustomerPayees();
			 customerPayee.setCustomerId(payeeAddRequestDto.getCustomerId());
			 customerPayee.setPayeeId(payeeAddRequestDto.getPayeeId());
			 payeeRepository.save(customerPayee);
			 userCreated = true;
		 }
		 
		 return userCreated;
	 }

	 public String getAddPayeeOTP(String email) {
	   try{
	    sendingMailforAddPAyee(email);
	     }catch(Exception e){
	    System.out.println(e);
	   } 
	  
	   return "OTP has been sent successfully to your mail";
	  }
	 public void sendingMailforAddPAyee(String email) throws Exception{
	  SimpleMailMessage message = new SimpleMailMessage();
	  Random rand = new Random();
	  String otp = String.format("%04d", rand.nextInt(10000));
	  message.setTo(email);
	  message.setSubject("OTP for Add Payee");
	  message.setText("Please use this OTP for add Payee : "+otp);
	  emailSender.send(message);
	 }


	

	@Override
	public boolean addPayee(PayeeAddRequestDto payeeAddRequestDto) {
		// TODO Auto-generated method stub
		CustomerPayees currentPayee  = new CustomerPayees();
		currentPayee.setCustomerId(payeeAddRequestDto.getCustomerId());
		currentPayee.setPayeeId(payeeAddRequestDto.getPayeeId());
		payeeRepository.save(currentPayee);
		return true;
		
	}	
}
