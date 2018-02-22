package com.htc.corejava.day3;

public class ComprehensiveCoverage implements Coverages{

	double minimumAmount;
	double coverageAmount;
	
	@Override
	public String converageInfo() {
		// TODO Auto-generated method stub
		return "Comprehensive coverage :----";
	}

	@Override
	public void setMinimumAmount() {
		// TODO Auto-generated method stub
		minimumAmount = 300.0;
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
		return "ComprehensiveCoverage [minimumAmount=" + minimumAmount + ", coverageAmount=" + coverageAmount + "]";
	}

}
