package com.htc.corejava.day3;

import java.util.Arrays;
import java.util.Date;

import com.htc.corejava.day3.Coverages;

public class Policy {

	private String policyNo;
	private Date issueDate;
	private double premium;
	
	private Coverages[] coverages;

	public Policy(String policyNo, Date issueDate, Coverages[] coverages) {
		super();
		this.policyNo = policyNo;
		this.issueDate = issueDate;
		this.coverages = coverages;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	
	public void calculatePremium(){		
		for(Coverages coverage : coverages) {
			premium = premium + coverage.getCoverageAmount();
		}
	}
	public Coverages[] getCoverages() {
		return coverages;
	}

	public void setCoverages(Coverages[] coverages) {
		this.coverages = coverages;
	}

	@Override
	public String toString() {
		return "Policy [policyNo=" + policyNo + ", issueDate=" + issueDate + ", premium=" + premium + ", coverages="
				+ Arrays.toString(coverages) + "]";
	}	
	
}
