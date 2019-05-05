package com.example.ABCBankDetails.service;

import org.springframework.stereotype.Service;

import com.example.ABCBankDetails.dto.CreateCustRequest;


@Service
public interface CustomerService {

	boolean createCustomer(CreateCustRequest custCreateRequest);
}
