package org.deloitte.telecom.dto;

import org.deloitte.telecom.entities.Customer;

public class SessionData {

    private Customer user;

    public void setUser(Customer user){
        this.user=user;
    }

    public Customer getUser(){
        return user;
    }




}
