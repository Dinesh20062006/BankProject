package com.wipro.bank.acc;

public  class RDAccount extends Account {

	public RDAccount(int tenure,float principal)
	{
		this.tenure=tenure;
		this.principal=principal;
	}
	public float calculateAmountDeposited()
	{
		return principal*tenure*12;
	}
	public float calculateInterest() {
	    int n = 4;
	    int t = tenure;
	    float r = rateOfInterest / 100;
	    float res = principal * (float)(Math.pow((1 + r / n), n * t) - 1);
	    return res;
	}
	
}
