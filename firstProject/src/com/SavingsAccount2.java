package com;

import java.security.GeneralSecurityException;

public class SavingsAccount2 {

 public int accNo;
public float balance;
public int pin ;
String status;

 static float interestRate = 4.2f;
//parameterized constructor
public SavingsAccount2(int accNo, float balance, int pin, String status) {
	super();
	this.accNo = accNo;
	this.balance = balance;
	this.pin = pin;
	this.status = status;
}
public void withdraw(int withdrawAmount){
		System.out.println(interestRate);
	if(withdrawAmount<=this.balance){
		this.balance= this.balance- withdrawAmount;
		
	}
	else
	{
		System.err.println("you have insuuficient funds");
		
		
	}
	
	
	
	
}
public void withdraw(int withdrawAmount,int pin){
if(this.pin == pin){
	if(withdrawAmount<40000){
	withdraw(withdrawAmount);
	}
	else{
		System.err.println("amount requested exceeded daily limit");
	}
}else{
	System.err.println("pin is error");
}

}

public void deposit(int depositAmount){
	if(depositAmount>0){
		this.balance = this.balance+ depositAmount;
		
	}
	else{
		System.out.println("Invalid deposit");
	}
	
}
public static float getInterestRate() {
	return interestRate;
}
public void transfer(int transferAmount){
	if(transferAmount>0)
	{
		this.accNo = this.accNo + transferAmount;
	}
	else
	{
		System.out.println("not valid");
	}
	
	
}




}
