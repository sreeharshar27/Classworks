package com.htc.corejava.day3;

public class LiabilityInsurance implements Coverages{

	private double minimumAmount;
	private double coverageAmount;

	@Override
	public String converageInfo() {
		return "Liability Insurance. Helps you in claims that exceed your coverage upper limit";
	}

	@Override
	public void setMinimumAmount() {
		//ADDITONAL LOGIC
		this.minimumAmount = 100.0;
	}

	public double getMinimumAmount() {
		return minimumAmount;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		if(coverageAmount > minimumAmount)
			this.coverageAmount = coverageAmount;
		else
			this.coverageAmount = minimumAmount;
	}

	@Override
	public String toString() {
		return "LiabilityInsurance [minimumAmount=" + minimumAmount + ", coverageAmount=" + coverageAmount + "]";
	}
	
}
