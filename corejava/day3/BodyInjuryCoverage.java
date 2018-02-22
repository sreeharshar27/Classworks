package com.htc.corejava.day3;

public class BodyInjuryCoverage implements Coverages{

	@Override
	public String toString() {
		return "BodyInjuryCoverage [minimuAmount=" + minimuAmount + ", coverageAmount=" + coverageAmount + "]";
	}

	double minimuAmount;
	double coverageAmount;
	
	@Override
	public String converageInfo() {
		// TODO Auto-generated method stub
		return "Body Injury coverage" ;
	}

	@Override
	public void setMinimumAmount() {
		// TODO Auto-generated method stub
		minimuAmount = 0.0;
	}

	@Override
	public void setCoverageAmount(double coverageAmount) {
		// TODO Auto-generated method stub
		this.coverageAmount = coverageAmount;
	}

	@Override
	public double getCoverageAmount() {
		// TODO Auto-generated method stub
		return this.coverageAmount;
	}

	
}
