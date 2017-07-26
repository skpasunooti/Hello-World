package com;

import firstProject.InSufficientException;

public class JrSavingsAccount extends SavingsAccount {
String guardiaName;

public JrSavingsAccount(int accNo, float balance, int pin, String status, String guardiaName) {
	super(accNo, balance, pin, status);
	this.guardiaName = guardiaName;
}
public void withdraw(int withdrawAmount,int pin) throws InSufficientException{
if(this.pin == pin){
	if(withdrawAmount<10000){
	withdraw(withdrawAmount);
	}
	else{
		System.err.println("amount requested exceeded daily limit");
	}
}else{
	System.err.println("pin is error");
}

}
public void getDetails(){
	System.out.println("accountNo:" + accNo);
	System.out.println("balance is :" +balance);
	System.out.println("pin no is :"+ pin);
}


}
