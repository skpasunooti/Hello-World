package com.dao;

import java.sql.SQLException;

public interface IProductDAO {

public Product getProductsById(int id) throws SQLException, ClassNotFoundException;
	
}
