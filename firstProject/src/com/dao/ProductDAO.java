package com.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO extends BaseDAO  {
	 
	public void addProducts(Product product) throws SQLException, ClassNotFoundException{
		Connection connection= null;
	
	
		try{
	
	Class.forName("org.gjt.mm.mysql.Driver");
	
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","Chandra@123");
	
	String selectQuery = "insert into test.mobiles(ID,Company,Price)" + "values(?,?,?)";
PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
preparedStatement.setInt(1, product.getID());
preparedStatement.setString(2, product.getCompany());
preparedStatement.setInt(3, product.getPrice() );

int i=preparedStatement.executeUpdate();
if(i==1){
	System.out.println("successfully added record");
	}}catch(Exception e){
		e.printStackTrace();
	}finally{
		connection.close();
	}
	
	}
	
	
	
}