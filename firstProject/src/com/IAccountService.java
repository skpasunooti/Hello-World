package com;

import firstProject.InSufficientException;

public interface IAccountService {
	
	
		public void withdraw(int withdrawAmount)throws InSufficientException;
		public void withdraw(int withdrawAmount,int pin) throws InSufficientException;
	    public void deposit(int depositAmount);
	

}
