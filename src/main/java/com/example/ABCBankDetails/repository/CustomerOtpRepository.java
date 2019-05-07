package com.example.ABCBankDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ABCBankDetails.model.CustomerOtp;

public interface CustomerOtpRepository extends JpaRepository<CustomerOtp,Integer>{

	@Query(value = "select otp from CustomerOtp where customer_id = customerId",nativeQuery = true)
	int getOtpByCustomerId(Long customerId);

}
