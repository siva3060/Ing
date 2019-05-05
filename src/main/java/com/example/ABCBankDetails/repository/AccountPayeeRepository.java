package com.example.ABCBankDetails.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.*;
@Repository
public interface AccountPayeeRepository extends JpaRepository<AccountPayeeRepository, Long>{

	List<AccountPayee> findByAccountNumber(int accountNumber);
void deleteByAccountNoSourceAndAccountNoTarget(int accountNoSource,int accountNoTarget);
	

}
