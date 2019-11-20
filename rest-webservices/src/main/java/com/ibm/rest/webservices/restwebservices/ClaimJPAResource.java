package com.ibm.rest.webservices.restwebservices;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.rest.webservices.restwebservices.claim.Claim;
import com.ibm.rest.webservices.restwebservices.claim.ClaimJpaRepository;
import com.ibm.rest.webservices.restwebservices.claim.HardcodedClaimService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ClaimJPAResource {
	
	@Autowired
	private HardcodedClaimService claimService;
	
	@Autowired
	private ClaimJpaRepository claimJpaRepository;
	
	@GetMapping("/jpa/users/{username}/claims")
	public List<Claim> getClaims(@PathVariable String username){
		return claimJpaRepository.findByUsername(username);
//		return claimJpaRepository.findAll();
		
	}
	@GetMapping("/jpa/users/{username}/claims/{claim_id}")
	public Claim getClaim(@PathVariable String username,@PathVariable String claim_id){
//		return claimService.findById(claim_id);
		return claimJpaRepository.findById(claim_id).get();
		
	}
	
//	Delete a claim for a user
//	DELETE /users/{user_name}/claims/{claim_id}
	@DeleteMapping("/jpa/users/{username}/claims/{claim_id}")
	public ResponseEntity<Void> deleteClaim(@PathVariable String username,@PathVariable String claim_id){
//		Claim claim=claimService.deleteById(claim_id);
		claimJpaRepository.deleteById(claim_id);
//		if(claim!=null)
//			return ResponseEntity.noContent().build();
//		return ResponseEntity.notFound().build();
		
		return ResponseEntity.noContent().build();
	}
	
//	Edit a claim for a user
//	PUT /users/{user_name}/claims/{claim_id}
	
	@PutMapping("/jpa/users/{username}/claims/{claim_id}")
	public ResponseEntity<Claim> updateClaim(@PathVariable String username, @PathVariable String claim_id,
			@RequestBody Claim claim) {
//		Claim claimUpdated=claimService.save(claim);
		Claim claimUpdated=claimJpaRepository.save(claim);
		
		return new ResponseEntity<Claim>(claim,HttpStatus.OK);
	}

	@PostMapping("/jpa/users/{username}/claims")
	public ResponseEntity<Void> updateClaim(@PathVariable String username,
			@RequestBody Claim claim) {
//		Claim claimCreated=claimService.save(claim);
		Claim claimCreated=claimJpaRepository.save(claim);
		//location
		//get current reosuerce url {id}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{claim_id}").buildAndExpand(claimCreated.getClaim_id()).toUri();

		return ResponseEntity.created(uri).build();
	}

}
