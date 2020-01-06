package com.deloitte.telecom.service;

import com.deloitte.telecom.entities.Customer;

public interface CustomerService {
	Customer createAccount(String mobileno,String name,String accounttype,double balance);
	Customer findCustomerByMobileno(String mobileno);
	Customer balanceEnquiry(String mobileno);
	Customer rechargeAmount(String mobileno,double amount);
	
}
