/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.AppDao;

import edu.mum.cs545.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author akolom
 */
public class ProductDao {

    
    HashMap<Integer, Product> productList = new HashMap<>();
    
    public ProductDao() {
    }
    
    public void intProduct(){
        
        productList.put(1, new Product(1, "Chair", 199, "Wooden chair"));
        productList.put(2, new Product(2, "TV", 486, "42inch TV"));
        productList.put(3, new Product(3, "Pillow", 12, "White pillow"));
        productList.put(4, new Product(4, "Watch", 89, "Men Watch"));
    
    }
    
    
      public List<Product> getProductList() {
        
        List<Product> list = new ArrayList<>();
        for(Object key: productList.keySet()){
            list.add((Product) productList.get(key));
        }
        return list;
    }

    
   
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

   
    public Product getStudentById(int id) {
       return (Product) productList.get(id);
    }

   
    public void remove(int id) {
        productList.remove(id);
    }

    
   
}
