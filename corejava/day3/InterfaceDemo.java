package com.htc.corejava.day3;

import java.util.Date;

import com.htc.corejava.day2.Policy;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		CollisionCoverage cc = new CollisionCoverage();
		cc.setCoverageAmount(500.0);
		
		ComprehensiveCoverage comc = new ComprehensiveCoverage();
		comc.setCoverageAmount(450.0);
		
		LiabilityInsurance li = new LiabilityInsurance();
		li.setCoverageAmount(400.0);
		
		Coverages[] coverages = {cc, comc, li};
		
		Policy p = new Policy("p0010101", new Date(), coverages);
		p.calculatePremium();
		System.out.println(p);
		System.out.println("=======================================");
		BodyInjuryCoverage bic = new BodyInjuryCoverage();
		bic.setCoverageAmount(600.0);
		
		Coverages[] coverages2 = {bic, cc, li};
		Policy p2 = new Policy("p00101344", new Date(), coverages2);
		p2.calculatePremium();
		System.out.println(p2);
	}
}
