package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
    public boolean validateData(float principal, int tenure, int age, String gender) {
        try {
    	if (principal <= 500 || !(tenure == 5 || tenure == 10) || !(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) || age < 1 || age > 100) {
            throw new BankValidationException();
        }
    	return true;
        }
        catch(BankValidationException e)
        {
        	System.out.println(e.toString());
        	return false;
        }
    }
    public void calculate(float principal,int tenure,int age,String gender)
    {
    	if(validateData(principal,tenure,age,gender))
    	{
    		RDAccount rdacc= new RDAccount(tenure, principal);
    		rdacc.setInterest(age, gender);
    		
    		float result = rdacc.calculateInterest();
    		System.out.println("Calculated Interest : "+result);
    		
    		float amountDeposite = rdacc.calculateAmountDeposited();
    		System.out.println("Amount Deposited : "+ amountDeposite);
    		
    		float maturity=rdacc.calculateMaturityAmount(amountDeposite, result);
    		System.out.println("Maturity amount : "+ maturity);
    		
    		
    	}
    }
}
