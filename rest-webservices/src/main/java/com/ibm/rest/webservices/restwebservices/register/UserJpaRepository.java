package com.ibm.rest.webservices.restwebservices.register;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
public interface UserJpaRepository extends JpaRepository<User, String> {

	 List<User> findByEmailId(String emailId) ;
//	List<User> findByConfirmationToken(String confirmationToken);

	

}
