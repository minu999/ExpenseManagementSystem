/**
 * 
 */
package com.ibm.rest.webservices.restwebservices.claim;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.rest.webservices.restwebservices.register.User;

/**
 * @author MinuS
 *
 */
@Repository
public interface ClaimRegisterJpaRepository extends JpaRepository<ClaimRegister, String>{

	List<ClaimRegister> findByEmailId(String emailId) ;
}
