package com;

import firstProject.InSufficientException;

public class AccountTransactionService extends Thread {
 private SavingsAccount savingsaccount;
 

public AccountTransactionService(SavingsAccount savingsaccount) {

	this.savingsaccount = savingsaccount;
}


public void run() {
	for (int i = 0; i < 4; i++) {
		try {
			savingsaccount.withdraw(1000);
		
		} catch (InSufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(savingsaccount.balance< 0){
			System.out.println("the balance is overdrawn.");
		}
	}
}

}
