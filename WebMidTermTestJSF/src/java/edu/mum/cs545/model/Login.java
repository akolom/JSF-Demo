/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.model;

import edu.mum.cs545.AppDao.PersonDao;

/**
 *
 * @author akolom
 */
public class Login {
    
    Person person = new Person();
    PersonDao personDao = new PersonDao();

    public Login() {
    }
    
    
    public boolean login(){
        
        for(Object key: personDao.getPersonList().keySet()){
            
           if(person.equals(personDao.getPersonList().get(key))){
               
           }
            
        }
        return person.isAdmin();
    }
    
}
