package com;

import java.security.GeneralSecurityException;

import firstProject.InSufficientException;

public class SavingsAccount implements IAccountService {

 public int accNo;
public float balance;
public int pin ;
public String status;
public static float interestRate = 4.2f;

public AccountHolder accountHolder;
public SavingsAccount() {
	// TODO Auto-generated constructor stub
}
static float InterestRate = 4.2f;
public synchronized static float getInterestRate1(){
	return InterestRate;
}
 @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
//parameterized constructor
public SavingsAccount(int accNo, float balance, int pin, String status) {
	super();
	this.accNo = accNo;
	this.balance = balance;
	this.pin = pin;
	this.status = status;
}
public synchronized void withdraw(int withdrawAmount) throws InSufficientException{
		//System.out.println(interestRate);
	if(withdrawAmount<=this.balance){
		this.balance= this.balance- withdrawAmount;
		try{
		System.out.println(Thread.currentThread().getName()+ "the withdraw method is running");
	     Thread.sleep(500);
		}catch (Exception e) {
	       e.printStackTrace();
	} 
		System.out.println("the thread "+Thread.currentThread().getName()+ "is finished withdrawing");
	}
		else{    
	System.out.println("the account is overdrawn");
			}
	}
	
	
	

public void withdraw(int withdrawAmount,int pin) throws InSufficientException{
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
