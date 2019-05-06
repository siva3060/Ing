package com.hcl.vewpayee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.vewpayee.entity.ViewPayee;

@Repository
public interface Viewpayeerepository extends JpaRepository<ViewPayee,Long> {
    List<ViewPayee> findByAccountNoSource(Long accountNoSource);
}
