package com.htc.corejava.day2;

public class ParameterPassDemo {

	public boolean changePremium(Policy pl, double newPremium) {
		pl.setPremium(newPremium);
		return true;
	}
	
	public static void main(String[] args) {
		Policy p = new Policy("1345678", "Kishore", 500.0);
		System.out.println(p.getPolicyNo() + ","+ p.getPolicyHolderName() + ","+ p.getPremium());
		
		
		ParameterPassDemo demo = new ParameterPassDemo();
		
		//passing object as parameter
		boolean result = demo.changePremium(p, 520.0);
		System.out.println("Premium changed:" + result);

		System.out.println(p.getPolicyNo() + ","+ p.getPolicyHolderName() + ","+ p.getPremium());
	}
}
