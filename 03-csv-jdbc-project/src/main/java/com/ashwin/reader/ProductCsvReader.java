package com.ashwin.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.ashwin.model.Product;

public class ProductCsvReader {

    public BufferedReader getReader() throws IOException {

        InputStream inputStream = getClass()
                .getClassLoader()
                .getResourceAsStream("products.csv");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(inputStream)
        );

        return reader;
    }

    public List<Product> readProducts() throws IOException {

        List<Product> products = new ArrayList<>();
        
        BufferedReader reader = getReader();
        
        String line;
        
        while ((line = reader.readLine()) != null) {
        	String[] data = line.split(",");

        	int id = Integer.parseInt(data[0]);
        	String name = data[1];
        	double price = Double.parseDouble(data[2]);

        	Product product = new Product(id, name, price);
        	products.add(product);
        }
        reader.close();
        return products;
    }
}