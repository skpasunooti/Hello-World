package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDAO {
public Connection getConnection(){
Connection connection =null;
	try{
	Class.forName("org.gjt.mm.mysql.Driver");
	
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Chandra@123");
}catch(Exception e){
	e.printStackTrace();
}
	return connection;
	}


}
