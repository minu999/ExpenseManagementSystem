package com.ibm.rest.webservices.restwebservices.claim;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseDetailsJpaRepository extends JpaRepository<ExpenseDetails, String> {

	List<ExpenseDetails> findByClaimId(String claimId) ;
}
