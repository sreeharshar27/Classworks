package com.htc.corejava.day6;

import java.util.Date;

public class PolicyInfo {

	private String policyNo;
	private String policyHolderName;
	private Date issueDate;
	private double premium;
	
	public PolicyInfo(){		
	}

	public PolicyInfo(String policyNo, String policyHolderName, Date issueDate, double premium) {
		super();
		this.policyNo = policyNo;
		this.policyHolderName = policyHolderName;
		this.issueDate = issueDate;
		this.premium = premium;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "PolicyInfo [policyNo=" + policyNo + ", policyHolderName=" + policyHolderName + ", premium=" + premium
				+ "]";
	}
	
}
