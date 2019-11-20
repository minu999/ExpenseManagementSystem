package com.ibm.rest.webservices.restwebservices.register;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ibm.rest.webservices.restwebservices.claim.Claim;



@CrossOrigin(origins="http://localhost:4200")
@RestController
public class UserJPAResource {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserJpaRepository userJpaRepository;
	
	@PostMapping("/jpa/users/{emailId}/user")
	public ResponseEntity<Void> updateUser(@PathVariable String emailId,
			@RequestBody User user) {
		
		User userCreated=userJpaRepository.save(user);
		//location
		//get current reosuerce url {id}
		URI uri=ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{emailId}").buildAndExpand(userCreated.getEmailId()).toUri();

		return ResponseEntity.created(uri).build();
	}
	@GetMapping("/jpa/users/{emailId}")
	public List<User> getUser(@PathVariable String emailId){
		return userJpaRepository.findByEmailId(emailId);
//		return claimJpaRepository.findAll();
		
	}
	
	@GetMapping("/jpa/users/{emailId}/user/{password}")
	public User getUserLogin(@PathVariable String emailId,@PathVariable String password){
		List<User> userList=userJpaRepository.findByEmailId(emailId);
//		boolean isValid=userService.findByUser(userList,emailId,password);
		return userService.findByUser(userList,emailId,password);
//		return claimJpaRepository.findAll();
		
	}
	
	@PutMapping("/jpa/users/{emailId}/user")
	public ResponseEntity<User> editUser(@PathVariable String emailId, 
			@RequestBody User user) {
//		Claim claimUpdated=claimService.save(claim);
		User userUpdated=userJpaRepository.save(user);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);
	}

}
