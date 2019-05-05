package com.example.ABCBankDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.AccountPayee;
import com.example.ABCBankDetails.model.CustomerPayees;

@Repository
public interface PayeeRepository extends JpaRepository<CustomerPayees,Integer> {
	List<AccountPayee> findByAccountNumber(Long accountNumber);

}
