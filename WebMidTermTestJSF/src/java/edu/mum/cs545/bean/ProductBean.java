/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.bean;

import edu.mum.cs545.AppDao.ProductDao;
import edu.mum.cs545.model.Product;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author akolom
 */
@Named(value = "productBean")
@SessionScoped
public class ProductBean implements Serializable {

    /**
     * Creates a new instance of ProductBean
     */
    
    private Product product = new Product();
    private ProductDao productDao = new ProductDao();
    public ProductBean() {
        
        productDao.intProduct();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public String save(){
        productDao.save(product);
        
        this.product=new Product();
        return "adminPage.jsf";
        
    }
    
    public String viewProduct(){
        
        findAll();
        
        return "productView.jsf";
    }
    
    public List<Product> findAll(){
        
        return productDao.getProductList();
    }
    
    public String edit(Product p){
        
        productDao.remove(p.getId());
        
        return "editProduct.jsf";
    }
    
    public String delete(Product p){
        
        productDao.remove(p.getId());
        
        return "productView.jsf";
    }
}
