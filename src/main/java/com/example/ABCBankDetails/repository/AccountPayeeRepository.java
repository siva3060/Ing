package com.example.ABCBankDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.AccountPayee;



@Repository
public interface AccountPayeeRepository extends JpaRepository<AccountPayee, Long>{
	
	
	AccountPayee getByAccountNoSourceAndAccountNoTarget(int accountNoSource,int accountNoTarget);

}
