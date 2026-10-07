package com.ashwin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ashwin.db.DBConnection;
import com.ashwin.model.Product;

public class ProductDao {
       
	public void insertProduct(Product product) throws SQLException {

	    String sql = "INSERT INTO products (id, name, price) VALUES (?, ?, ?)";

	    Connection connection = DBConnection.getConnection();

	    PreparedStatement statement = connection.prepareStatement(sql);

	    statement.setInt(1, product.getId());
	    statement.setString(2, product.getName());
	    statement.setDouble(3, product.getPrice());

	    statement.executeUpdate();

	    statement.close();
	    connection.close();
	}
}
