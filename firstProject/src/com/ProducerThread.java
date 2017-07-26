package com;

public class ProducerThread  extends Thread{
private X x;

	public ProducerThread(X x) {

	this.x = x;
}
	@Override
	public void run() {
		int i =0;
		
		while(true){
			x.putData(++i);
		}
	}
}
