package com.dao;

import java.sql.SQLException;

public class ProductMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	ProductDAO productDAO = new ProductDAO();
	

	}


/*
package firstProject;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.concurrent.SynchronousQueue;

import javax.management.RuntimeErrorException;
import javax.security.sasl.SaslException;

import com.AccountHolder;
import com.AccountTransactionService;
import com.ConsumerThread;
import com.JrSavingsAccount;
import com.ProducerThread;
import com.SavingsAccount;
import com.X;
import com.java.item;
import com.order;
import com.dao.Product;
import com.dao.ProductDAO;
import com.dao.*;
public class tests extends Object {
public static void process() throws SQLException{
	Connection connection = null;
	try{
	
	connection = DriverManager.getConnection("");
}catch (Exception e){
	System.out.println("excetion handler");	
}
	
  finally{
	 if(connection != null){
	  connection.close();
  }
}
}	
	public static void main(String[] args) throws SQLException, InterruptedException, ClassNotFoundException   {
ProductDAO productDAO = new ProductDAO();
Product product=productDAO.getProductsById();
System.out.println(product.getCity_id());
		/*X x = new X();
ConsumerThread consumerThread = new ConsumerThread(x);
ProducerThread producerThread = new ProducerThread(x);

producerThread.setName("producer");
consumerThread.setName("consumer");
producerThread.start();
consumerThread.start();*/
/*SavingsAccount account = new SavingsAccount(1234, 7000, 1234, "Active");
SavingsAccount account2 = new SavingsAccount(1234, 5000, 5462, "Active");
AccountTransactionService accountTransactionService = new AccountTransactionService(account);

accountTransactionService.setName("TransactionA");
accountTransactionService.start();

AccountTransactionService accountTransactionService2 = new AccountTransactionService(account2);
accountTransactionService2.setName("TransactionB");
accountTransactionService2.start();*/
	
		/*Runtime runtime=Runtime.getRuntime();
		System.out.println("total memory is:"+ runtime.totalMemory());
		System.out.println("free memory is:"+ runtime.freeMemory());
		for(int i=0; i<4000; i++){
			new SavingsAccount(i+1, 5000, 1234, "Active");
		}
		System.out.println("free memory is:"+ runtime.freeMemory());
		System.out.println("calling gc:");
		runtime.gc();
		System.out.println("final free memory is :"+ runtime.freeMemory());*/
		
		//Class class1= Class.forName("Item");
		
	//	String s1 = new String("Hello World");
	//String s2 = new String("Hello World");
	//	Item item1 = new Item(123, "i765", 45);
		/*Item itemOriginal = new Item(123, "i765", 45);
		Item itemClone = (Item)itemOriginal.clone();
		Item item2 = new Item(123, "i765", 45);
		SavingsAccount account = new SavingsAccount(1234, 1345, 1234, "Active");
		account.withdraw(345,123);
		System.out.println("final balance is :"+ account.balance);*/
		//System.out.println(itemOriginal ==itemClone);
		//System.out.println(account.getDetails());
		//System.out.println(item1.hashCode());
		//System.out.println(item2.hashCode());
		//System.out.println(item1.toString());
		/*Class class1= item2.getClass();
		System.out.println(class1.getName());
Method[] methods = class1.getMethods();
      Class c1=s1.getClass();
System.out.println(c1.getName());

for(Method i:methods){
	System.out.println(i.getName());
	
}*/
		/*	Bid[] bidsArray = new Bid[3];
		bidsArray[0] = new Bid(123,345);
		bidsArray[1] = new Bid(122,340);
		bidsArray[2] = new Bid(121,335);
		item.setBids(bidsArray);
		System.out.println("1st bid item:"+ item.getId());
		for(Bid bids:bidsArray){
			System.out.println("bid id:"+ bids.getId());
			System.out.println("bid amount:"+ bids.getPrice());
		}
		*/
		
		/* order Order = new order();
  System.out.println("order is "+ Order .getId());
  Order.setId(3564);
  System.out.println("order is"+ Order.getId());*/
  
//SavingsAccount account =  new JrSavingsAccount(123, 20000, 123, "yes", "harry");
/*account.accountHolder = new AccountHolder("hary", "male", "1234", "hary@mail.com");
System.out.println("name :"+account.accountHolder.getName());
account.accountHolder.setName("sai");
System.out.println("name:"+account.accountHolder.getName());*/

/*account.withdraw(2000,1234);
System.out.println("balance:"+ account.balance);
JrSavingsAccount jrAccount = (JrSavingsAccount)account;*/

		/*item Item = new item();
 Item.list();
 JrSavingsAccount account = new JrSavingsAccount(345, 123, 345, "adey", "mahesh");
 account.getDetails();*/
 
		/*JrSavingsAccount account = new JrSavingsAccount(30,45,252,"harry","active");
account.withdraw(2000);
System.out.println(account.balance);*/

	/*savingsAccount account=new savingsAccount(101,40525,031,"Active");
	savingsAccount account2 = new savingsAccount(102,254000,2654,"Active");
	account.withdraw(45000,031);
  System.out.println("account balance:"+account.balance);*/

  
  
	}
