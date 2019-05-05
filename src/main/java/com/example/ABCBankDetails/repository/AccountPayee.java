package com.example.ABCBankDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.*;



@Repository
public interface AccountPayee extends JpaRepository<AccountPayee, Long>{

	List<AccountPayee> findByAccountNumber(Long accountNumber);
}
