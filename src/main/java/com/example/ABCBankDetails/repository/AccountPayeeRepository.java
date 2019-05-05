package com.example.ABCBankDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.CustomerPayees;



@Repository
public interface AccountPayeeRepository extends JpaRepository<CustomerPayees, Long>{
	
	
	void deleteByAccountNoSourceAndAccountNoTarget(int accountNoSource,int accountNoTarget);

}
