/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.AppDao;

import edu.mum.cs545.model.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author akolom
 */
public class PersonDao {
    
    private HashMap<Integer, Person> personList = new HashMap<>();

    public PersonDao() {
    }
    
    public void intPerson(){
        
        
        
          personList.put(1, new Person(1, "Jack", "jack", "apple", true));
        personList.put(2, new Person(2, "Jill", "jill", "rose", false));
        personList.put(3, new Person(3, "John", "john", "car", false));
        personList.put(4, new Person(4, "Jim", "jim", "house", false));
        personList.put(5, new Person(5, "Jane", "jane", "diamond", false));
        personList.put(6, new Person(6, "Jordan", "jo", "ball", false));
        personList.put(7, new Person(7, "Jasmin", "jas", "jazz", false));
    }

    public HashMap<Integer, Person> getPersonList() {
        return personList;
    }
    
    
    
     public List<Person> findAll() {
        List<Person> list = new ArrayList<>();
        for(Object key: personList.keySet()){
            list.add((Person) personList.get(key));
        }
        return list;
                //(Collection<Student>) record.values();
    }
    
}
