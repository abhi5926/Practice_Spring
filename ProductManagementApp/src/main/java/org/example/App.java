package org.example;

import java.util.List;


public class App {
    public static void main(String[] args) {

        ProductService service = new ProductService();


        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Table", 2022));
        service.addProduct(new Product("Mac Studio", "Computer", "white Table", 2023));
        service.addProduct(new Product("vivo 91i", "Mobile", "Dreawer", 2021));

        List<Product> products = service.getAllProduct();
       for(Product p : products){
           System.out.println(p);
       }
        System.out.println("=====================================================");

        System.out.println("a Perticular Product ");
 

      Product p =  service.getProduct("Mac Studio");
        System.out.println(p);
    }
}
