package org.deloitte.telecom.dao;

import org.deloitte.telecom.entities.Customer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {

    private Map<Integer, Customer>store=new HashMap<>();

    public UserDaoImpl(){
        store.put(1,new Customer(1,"harika","1234"));
        store.put(2,new Customer(2,"bindu","5678"));

    }

    @Override
    public boolean credentialsCorrect(int id ,String password){
    	Customer user=store.get(id);
        if(user==null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    @Override
    public Customer findUserById(int id){
    	Customer user=store.get(id);
        return user;
    }
}
