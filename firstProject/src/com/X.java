package com;

public class X {
private int data;
private boolean flag=false;
public synchronized int getData() {
	if(flag == false){
		try{this.wait();
	}
	
	catch(Exception e){
		e.printStackTrace();
	}

	
	}flag= false;
	this.notify();
	return  data ;
}

public void putData(int data) {
	if(flag==true){
		try{
			this.wait();
		
	}
	catch(Exception e){
	e.printStackTrace();	
	}
	}
	this.data = data;
	System.out.println(Thread.currentThread().getName()+this.data);
     flag =true;
     this.notify();
}



}
