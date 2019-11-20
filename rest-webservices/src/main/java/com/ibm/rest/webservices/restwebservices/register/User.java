/**
 * 
 */
package com.ibm.rest.webservices.restwebservices.register;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Minu S
 *
 */
@Entity
public class User {

	
	private String Name;
	private String password;
	private String userType;
	private String secQuestion;
	private String secAnswer;
	@Id
	@Column(name = "emailId", nullable = false)
	private String emailId;
	private long phone;
	private boolean isVerified;

	public User() {
		super();
	}

	public User(String name, String password, String userType, String secQuestion, String secAnswer, String emailId,
			long phone, boolean isVerified) {
		super();
		
		this.Name = name;
		this.password = password;
		this.userType = userType;
		this.secQuestion = secQuestion;
		this.secAnswer = secAnswer;
		this.emailId = emailId;
		this.phone = phone;
		this.isVerified = isVerified;
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getSecQuestion() {
		return secQuestion;
	}

	public void setSecQuestion(String secQuestion) {
		this.secQuestion = secQuestion;
	}

	public String getSecAnswer() {
		return secAnswer;
	}

	public void setSecAnswer(String secAnswer) {
		this.secAnswer = secAnswer;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

}
