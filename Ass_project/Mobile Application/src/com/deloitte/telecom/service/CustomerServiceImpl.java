package com.deloitte.telecom.service;

import com.deloitte.telecom.entities.Customer;

import com.deloitte.telecom.dao.CustomerDao;
import com.deloitte.telecom.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao dao;
	public CustomerServiceImpl(CustomerDaoImpl customerDaoImpl) {
        this.dao = customerDaoImpl;
        
	}
	public CustomerDao getDao() {
		return dao;
	}
	

	@Override
	public Customer findCustomerByMobileno(String mobileno) {
		Customer c=dao.findCustomerByMobileno(mobileno);
		return c;
        
	}

	@Override
	public Customer balanceEnquiry(String mobileno) {
		return dao.balanceEnquiry(mobileno);
	}

	@Override
	public Customer rechargeAmount(String mobileno, double amount) {
		return dao.rechargeAmount(mobileno,amount);
		
	}

	

	@Override
	public Customer createAccount(String mobileno, String name, String accounttype, double balance) {
		Customer c=dao.createAccount(mobileno, name, accounttype, balance);
		return c;
		}

}
