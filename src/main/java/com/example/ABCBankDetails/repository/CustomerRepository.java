package com.example.ABCBankDetails.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	Customer findByCustomerAccountNumber(Long accountNum);

	Customer findByCustomerName(String accountName);


}
