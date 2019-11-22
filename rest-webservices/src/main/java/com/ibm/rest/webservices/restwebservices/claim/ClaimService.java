/**
 * 
 */
package com.ibm.rest.webservices.restwebservices.claim;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.rest.webservices.restwebservices.register.User;

/**
 * @author MinuS
 *
 */
@Service
public class ClaimService {
	private static List<ClaimRegister> claims = new ArrayList();
	private static List<ExpenseDetails> expenses = new ArrayList();
//	private static int idCounter=1;
	public ClaimRegister save(ClaimRegister claim) {
		
					claims.add(claim);
		
		return claim;
	}
	
	public ClaimRegister findClaimByEmailId(String id) {
		// TODO Auto-generated method stub
		System.out.println("findClaimByEmail");
		for(ClaimRegister claim:claims)
		{
			System.out.println(claim);
			if(claim.getEmailId().equalsIgnoreCase(id))
			{
				
				System.out.println("claim="+claim);
				return claim;
			}
		}
		return null;
	}
	
}
