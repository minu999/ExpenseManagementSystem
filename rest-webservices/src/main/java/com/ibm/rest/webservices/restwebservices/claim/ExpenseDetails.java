/**
 * 
 */
package com.ibm.rest.webservices.restwebservices.claim;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author MinuS
 *
 */
@Entity
public class ExpenseDetails {

	@Id
	@Column(name = "claimId", nullable = false)
	private String claimId;
	
	private String expenseId;
	private String expenseDetail;
	private String description;
	private String typeOfExpense;
	private String paymentMode;
	private String expenseDateTime;
	private String invoiceFilePath;
	
	
	public ExpenseDetails() {
		super();
	}


	public ExpenseDetails(String claimId, String expenseId, String expenseDetail, String description,
			String typeOfExpense, String paymentMode, String expenseDateTime, String invoiceFilePath) {
		super();
		this.claimId = claimId;
		this.expenseId = expenseId;
		this.expenseDetail = expenseDetail;
		this.description = description;
		this.typeOfExpense = typeOfExpense;
		this.paymentMode = paymentMode;
		this.expenseDateTime = expenseDateTime;
		this.invoiceFilePath = invoiceFilePath;
	}


	public String getClaimId() {
		return claimId;
	}


	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}


	public String getExpenseId() {
		return expenseId;
	}


	public void setExpenseId(String expenseId) {
		this.expenseId = expenseId;
	}


	public String getExpenseDetail() {
		return expenseDetail;
	}


	public void setExpenseDetail(String expenseDetail) {
		this.expenseDetail = expenseDetail;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTypeOfExpense() {
		return typeOfExpense;
	}


	public void setTypeOfExpense(String typeOfExpense) {
		this.typeOfExpense = typeOfExpense;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public String getExpenseDateTime() {
		return expenseDateTime;
	}


	public void setExpenseDateTime(String expenseDateTime) {
		this.expenseDateTime = expenseDateTime;
	}


	public String getInvoiceFilePath() {
		return invoiceFilePath;
	}


	public void setInvoiceFilePath(String invoiceFilePath) {
		this.invoiceFilePath = invoiceFilePath;
	}
	
	
}
