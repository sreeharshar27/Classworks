package com.htc.corejava.day2;

public class Policy {

	private String policyNo;
	private String policyHolderName;
	private double premium;
	
	public Policy() {

	}

	public Policy(String policyNo, String policyHolderName, double premium) {
		super();
		this.policyNo = policyNo;
		this.policyHolderName = policyHolderName;
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

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}
	
	
}
