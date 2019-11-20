package com.ibm.rest.webservices.restwebservices.claim;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClaimRegister {

	@Id
	@Column(name = "claimId", nullable = false)
	private String claimId;
	
	private String claimName;
	private String projectId;
	
	private String approverEmailId;
	private String emailId;
	private String travelStartDateTime;
	private String travelEndDateTime;
	private boolean isValidated;
	private boolean isApproved;
	private String claimStatus;
	
	public ClaimRegister() {
		super();
	}

	public ClaimRegister(String claimId, String claimName, String projectId, String approverEmailId,
			String emailId, String travelStartDateTime, String travelEndDateTime, boolean isValidated,
			boolean isApproved, String claimStatus) {
		super();
		this.claimId = claimId;
		this.claimName = claimName;
		this.projectId = projectId;
		this.approverEmailId = approverEmailId;
		this.emailId = emailId;
		this.travelStartDateTime = travelStartDateTime;
		this.travelEndDateTime = travelEndDateTime;
		this.isValidated = isValidated;
		this.isApproved = isApproved;
		this.claimStatus = claimStatus;
	}

	public String getClaimId() {
		return claimId;
	}

	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}

	public String getClaimName() {
		return claimName;
	}

	public void setClaimName(String claimName) {
		this.claimName = claimName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getApproverEmailId() {
		return approverEmailId;
	}

	public void setApproverEmailId(String approverEmailId) {
		this.approverEmailId = approverEmailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getTravelStartDateTime() {
		return travelStartDateTime;
	}

	public void setTravelStartDateTime(String travelStartDateTime) {
		this.travelStartDateTime = travelStartDateTime;
	}

	public String getTravelEndDateTime() {
		return travelEndDateTime;
	}

	public void setTravelEndDateTime(String travelEndDateTime) {
		this.travelEndDateTime = travelEndDateTime;
	}

	public boolean isValidated() {
		return isValidated;
	}

	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(String claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	
}
