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
import com.ibm.rest.webservices.restwebservices.claim.HardcodedClaimService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ClaimResource {
	
	@Autowired
	private HardcodedClaimService claimService;
	
	@GetMapping("/users/{username}/claims")
	public List<Claim> getClaims(@PathVariable String username){
		return claimService.findAll();
		
	}
	@GetMapping("/users/{username}/claims/{claim_id}")
	public Claim getClaim(@PathVariable String username,@PathVariable String claim_id){
		return claimService.findById(claim_id);
		
	}
	
//	Delete a claim for a user
//	DELETE /users/{user_name}/claims/{claim_id}
	@DeleteMapping("/users/{username}/claims/{claim_id}")
	public ResponseEntity<Void> deleteClaim(@PathVariable String username,@PathVariable String claim_id){
		Claim claim=claimService.deleteById(claim_id);
		if(claim!=null)
			return ResponseEntity.noContent().build();
		return ResponseEntity.notFound().build();
	}
	
//	Edit a claim for a user
//	PUT /users/{user_name}/claims/{claim_id}
	
	@PutMapping("/users/{username}/claims/{claim_id}")
	public ResponseEntity<Claim> updateClaim(@PathVariable String username, @PathVariable String claim_id,
			@RequestBody Claim claim) {
		Claim claimUpdated=claimService.save(claim);
		
		return new ResponseEntity<Claim>(claim,HttpStatus.OK);
	}

	@PostMapping("/users/{username}/claims")
	public ResponseEntity<Void> updateClaim(@PathVariable String username,
			@RequestBody Claim claim) {
		Claim claimCreated=claimService.save(claim);
		//location
		//get current reosuerce url {id}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{claim_id}").buildAndExpand(claimCreated.getClaim_id()).toUri();

		return ResponseEntity.created(uri).build();
	}

}
