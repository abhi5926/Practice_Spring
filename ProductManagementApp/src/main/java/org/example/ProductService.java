package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProduct(){
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
