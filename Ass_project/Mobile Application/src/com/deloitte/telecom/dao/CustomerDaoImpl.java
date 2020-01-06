package com.deloitte.telecom.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.deloitte.telecom.entities.Customer;
import com.deloitte.telecom.exceptions.IncorrectMobilenoException;



public class CustomerDaoImpl implements CustomerDao{
	private Map<String,Customer> store = new HashMap<>();
	Scanner sc=new Scanner(System.in);
	
	public Map<String,Customer> getStore(){
		return store;
	}
	@Override
	public Customer balanceEnquiry(String mobileno) {
		if(store.containsKey(mobileno)) {
			Customer c=store.get(mobileno);
			return c;
			
		}
		else
			throw new IncorrectMobilenoException("mobileno is incorrect");
		
	}

	@Override
	public Customer rechargeAmount(String mobileno, double amount) {
		if(store.containsKey(mobileno)) {
			Customer c=store.get(mobileno);
		c.setBalance(c.getBalance() + amount);
		return c;
		}
		else
			throw new IncorrectMobilenoException("mobileno is incorrect");
		
	}

	@Override
	public Customer createAccount(String mobileno,String name,String accounttype,double balance) {
		Customer c= new Customer(mobileno, name, accounttype, balance);
		store.put(mobileno, c);
		return c;
	}

	
	

	@Override
	public Customer findCustomerByMobileno(String mobileno) {
		Customer c = store.get(mobileno);
	      if (c == null) {
	            throw new com.deloitte.telecom.exceptions.CustomerNotFoundException("Customer not found for Mobileno=" + mobileno);
	    }
	      return c;
	  }
	}


