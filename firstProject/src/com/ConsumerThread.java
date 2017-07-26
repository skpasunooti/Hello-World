package com;

public class ConsumerThread extends Thread {
private X x;
	
	public ConsumerThread(X x) {
	super();
	this.x = x;
}

	public void run() {
 while(true){
		System.out.println(x.getData());	
 }
	
}
	}

