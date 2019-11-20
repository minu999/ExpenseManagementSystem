package com.ibm.rest.webservices.restwebservices.claim;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class HardcodedClaimService {
	
	private static List<Claim> claims=new ArrayList();
	private static int idCounter=0;
	
	static {
		claims.add(new Claim(idCounter++,"A"+idCounter,"claim"+idCounter,"description",200,true,new Date(),new Date()));
		claims.add(new Claim(idCounter++,"A"+idCounter,"claim"+idCounter,"description",400,true,new Date(),new Date()));
		claims.add(new Claim(idCounter++,"A"+idCounter,"claim"+idCounter,"description",100,true,new Date(),new Date()));
		claims.add(new Claim(idCounter++,"A"+idCounter,"claim"+idCounter,"description",400,true,new Date(),new Date()));
		claims.add(new Claim(idCounter++,"A"+idCounter,"claim"+idCounter,"description",600,false,new Date(),new Date()));
	}
	
	public List<Claim> findAll()
	{
		return claims;
	}
	public Claim save(Claim claim)
	{
		if(claim.getClaim_id().equals("111"))
		{
			claim.setClaim_id("claim"+idCounter);
			claims.add(claim);
		}
		else
		{
			deleteById(claim.getClaim_id());
			claims.add(claim);
			
		}
		return claim;
	}
	public Claim deleteById(String id) {
		Claim claim=findById(id);
		if(claim==null)
			return null;
		if(claims.remove(claim))
			return claim;
		return null;
	}
	

	public Claim findById(String id) {
		// TODO Auto-generated method stub
		for(Claim claim:claims)
		{
			if(claim.getClaim_id().equalsIgnoreCase(id))
			{
				return claim;
			}
		}
		return null;
	}
}
