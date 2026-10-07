package com.ashwin.main;


import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.ashwin.dao.ProductDao;
import com.ashwin.model.Product;
import com.ashwin.reader.ProductCsvReader;

class Main{
public static void main(String[] args) throws IOException, SQLException {

    ProductCsvReader reader = new ProductCsvReader();

    List<Product> products = reader.readProducts();

    ProductDao dao = new ProductDao();

    for (Product product : products) {
        dao.insertProduct(product);
    }

    System.out.println("All products inserted successfully!");
}
}