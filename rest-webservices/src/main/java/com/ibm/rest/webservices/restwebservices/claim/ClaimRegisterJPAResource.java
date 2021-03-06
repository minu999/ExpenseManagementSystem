package com.ibm.rest.webservices.restwebservices.claim;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ClaimRegisterJPAResource {

	@Autowired
	private ClaimService claimService;
	
	@Autowired
	private ClaimRegisterJpaRepository claimJpaRepository;
	
	@Autowired
	private ExpenseDetailsJpaRepository expenseJpaRepository;
	
	@PostMapping("/jpa/users/{emailId}/registerClaim")
	public ResponseEntity<Void> createClaim(@PathVariable String emailId,
			@RequestBody ClaimRegister claim) {
		
		ClaimRegister claimCreated=claimJpaRepository.save(claim);
		//location
		//get current reosuerce url {id}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{emailId}").buildAndExpand(claimCreated.getEmailId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	//create expense details
	@PostMapping("/jpa/users/{claimId}/addExpense")
	public ResponseEntity<Void> createExpense(@PathVariable String claimId,
			@RequestBody ExpenseDetails expense) {
		
		ExpenseDetails expenseCreated=expenseJpaRepository.save(expense);
		//location
		//get current reosuerce url {id}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{claimId}").buildAndExpand(expenseCreated.getClaimId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	
	//get Claim id from email id
	@GetMapping("/jpa/users/{emailId}/getClaimId")
	public ClaimRegister getClaimIdbyEmailId(@PathVariable String emailId){
		return claimJpaRepository.findClaimIdByEmailId(emailId);
		
	}
}
