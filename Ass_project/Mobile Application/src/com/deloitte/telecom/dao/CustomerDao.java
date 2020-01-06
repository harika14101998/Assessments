package com.deloitte.telecom.dao;

import java.util.Map;

import com.deloitte.telecom.entities.Customer;

public interface CustomerDao {
	Customer findCustomerByMobileno(String mobileno);
	Customer balanceEnquiry(String mobileno);
	Customer rechargeAmount(String mobileno,double amount);
	Customer createAccount(String mobileno,String name,String accounttype,double balance);
	Map<String,Customer> getStore();

}
