/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.bean;

import edu.mum.cs545.AppDao.ApplicationDao;
import edu.mum.cs545.AppDao.PersonDao;
import edu.mum.cs545.model.Person;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author akolom
 */
@Named(value = "loginBean")
//@SessionScoped
@RequestScoped
public class LoginBean {
       // implements Serializable {

    /**
     * Creates a new instance of LoginBean
     */
    
    //private Login login = new Login();
    
     private Person person = new Person();
    PersonDao personDao = new PersonDao();
    ApplicationDao appDao = new ApplicationDao();
    
    private  FacesContext facesContext = FacesContext.getCurrentInstance();
    public LoginBean() {
        
        personDao.intPerson();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    
    public String login(){
        
        for(Object key: personDao.getPersonList().keySet()){
            
           if(person.equals(personDao.getPersonList().get(key))){
              
              
       
              person = personDao.getPersonList().get(key);
               if(person.isAdmin()){
                   return "adminPage.jsf";
               }
               
               else{
                   return "userPage.jsf";
               }
               
           }
            
        }
        
       


        return "login.jsf";
    }
    
}
