package com.revature.entity;

public class Request {
	private int id;
	private int empId;
	private int mgrId;
	private int requestAmount;
	private String expenseDate;
	private String status;
	private String decision;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getMgrId() {
		return mgrId;
	}
	public void setMgrId(int mgrId) {
		this.mgrId = mgrId;
	}
	public int getRequestAmount() {
		return requestAmount;
	}
	public void setRequestAmount(int requestAmount) {
		this.requestAmount = requestAmount;
	}
	public String getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(String expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDecision() {
		return decision;
	}
	public void setDecision(String decision) {
		this.decision = decision;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", empId=" + empId + ", mgrId=" + mgrId + ", requestAmount=" + requestAmount
				+ ", expenseDate=" + expenseDate + ", status=" + status + ", decision=" + decision + "]";
	}
	
	

}
