package com.wipro.bank.main;
import java.util.Scanner;

import com.wipro.bank.service.BankService;
public class Main {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the tenure period (5 or 10) :");
	int tenure = sc.nextInt();
	
	System.out.print("Enter the principal amount (minimum principal amount is 500) :");
    float principal=sc.nextFloat();

	System.out.print("Enter the Age :");
	int age =sc.nextInt();

	System.out.print("Enter the Gender :");
	String gender=sc.next();
	
	BankService bs=new BankService();
	bs.calculate(principal, tenure, age, gender);
    sc.close();
}
}
