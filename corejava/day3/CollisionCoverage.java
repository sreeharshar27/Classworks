package com.htc.corejava.day3;

public class CollisionCoverage implements Coverages{

	double minimumAmount;
	double coverageAmount;
	
	@Override
	public String converageInfo() {
		return "Collision coverage will pay the repairs to your car.";
	}

	@Override
	public void setMinimumAmount() {
		minimumAmount = 0.0;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	@Override
	public String toString() {
		return "CollisionCoverage [minimumAmount=" + minimumAmount + ", coverageAmount=" + coverageAmount + "]";
	}
	
}
