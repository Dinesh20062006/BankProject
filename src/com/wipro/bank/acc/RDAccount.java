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
	    double i = (rateOfInterest / 100.0) / 4.0; 

	    double months = tenure * 12.0; 

	    double numerator = Math.pow(1 + i, months / 3.0) - 1;
	    double denominator = 1 - Math.pow(1 + i, -1.0 / 3.0); 
	    
	    double maturity = principal * (numerator / denominator);
	    double deposited = calculateAmountDeposited();

	    return (float) (maturity - deposited);
	}
	public float calculateInterest1() {
	    int n = 4;
	    int t = tenure;
	    float r = rateOfInterest / 100;
	    float res = principal * (float)(Math.pow((1 + r / n), n * t) - 1);
	    return res;
	}
}
