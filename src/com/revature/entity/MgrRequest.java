package com.revature.entity;

public class MgrRequest {

	//m.first_name,m.last_name,r.request_id,r.status,r.decision
	private String firstName;
	private String lastName;
	private int requestId;
	private String status;
	private String decision;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
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
		return "MgrRequest [firstName=" + firstName + ", lastName=" + lastName + ", requestId=" + requestId
				+ ", status=" + status + ", decision=" + decision + "]";
	}
	
	
}
