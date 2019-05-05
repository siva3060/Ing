package com.example.ABCBankDetails.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AccountPayeeRepository extends JpaRepository<AccountPayeeRepository, Long>{
	
	List<CustomerPayees> findByCustomerId(Long accountNumber);
	void deleteByAccountNoSourceAndAccountNoTarget(int accountNoSource,int accountNoTarget);	
	AccountPayee getByAccountNoSourceAndAccountNoTarget(int accountNoSource,int accountNoTarget);

}
