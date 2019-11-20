package com.ibm.rest.webservices.restwebservices.claim;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Claim {
	
	private long user_id;
	private String username;
	@Id
	@Column(name = "claim_id", nullable = false)
	private String claim_id; //Id should be a wrapper class. if long, use Long
	private String claimDescription;
	private double claimCost;
	private boolean isApproved;
	private Date approvedDate;
	private Date claimDate;
	
	
	public Claim() {
		super();
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getClaimDescription() {
		return claimDescription;
	}
	public void setClaimDescription(String claimDescription) {
		this.claimDescription = claimDescription;
	}
	public double getClaimCost() {
		return claimCost;
	}
	public void setClaimCost(double claimCost) {
		this.claimCost = claimCost;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	public Date getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}
	public Date getClaimDate() {
		return claimDate;
	}
	public void setClaimDate(Date claimDate) {
		this.claimDate = claimDate;
	}
	public Claim(long user_id, String username, String claim_id, String claimDescription, double claimCost,
			boolean isApproved, Date approvedDate, Date claimDate) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.claim_id = claim_id;
		this.claimDescription = claimDescription;
		this.claimCost = claimCost;
		this.isApproved = isApproved;
		this.approvedDate = approvedDate;
		this.claimDate = claimDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claim_id == null) ? 0 : claim_id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Claim other = (Claim) obj;
		if (claim_id == null) {
			if (other.claim_id != null)
				return false;
		} else if (!claim_id.equals(other.claim_id))
			return false;
		return true;
	}
	
	
}
