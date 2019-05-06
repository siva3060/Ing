package com.example.ABCBankDetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ABCBankDetails.model.ViewPayee;

@Repository
public interface Viewpayeerepository extends JpaRepository<ViewPayee,Long> {
    List<ViewPayee> findByAccountNoSource(Long accountNoSource);
}
