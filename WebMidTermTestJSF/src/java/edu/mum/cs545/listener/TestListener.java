/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.listener;

import edu.mum.cs545.AppDao.ApplicationDao;
import edu.mum.cs545.AppDao.ProductDao;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Web application lifecycle listener.
 *
 * @author akolom
 */
public class TestListener implements ServletContextListener {
    
//    ApplicationDao appDao = new ApplicationDao();
//    ProductDao productDao = new ProductDao();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        
      //  productDao.intProduct();
       // sce.getServletContext().setAttribute("loggin", appDao.getValue());
        
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }
}
