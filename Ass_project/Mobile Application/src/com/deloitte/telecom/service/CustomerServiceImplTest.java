package com.deloitte.telecom.service;

import java.util.Map;

import org.junit.*;

import com.deloitte.telecom.dao.CustomerDaoImpl;
import com.deloitte.telecom.entities.Customer;



public class CustomerServiceImplTest {
	@Test
	public void testCreateAccount_1() {
		CustomerServiceImpl service=new CustomerServiceImpl(new CustomerDaoImpl());
		String mobileno="1234567890";
		String name="harika";
		String accounttype="prepaid";
		double balance=100;
		Customer c= service.createAccount(mobileno,name,accounttype,balance);
		Assert.assertNotNull(c);
		double resultBalance=c.getBalance();
		Assert.assertEquals(balance,resultBalance,0);
		Assert.assertEquals(name,c.getName());
		Map<String,Customer>store=service.getDao().getStore();
		
		Customer expected=store.get(mobileno);
		Assert.assertNotNull(expected);
		Assert.assertEquals(expected, c);
				
}
	
	@Test
	public void testBalanceInquiry_1() {
		CustomerServiceImpl service=new CustomerServiceImpl(new CustomerDaoImpl());
		String mobileno="1234567890";
		String name="harika";
		String accounttype="prepaid";
		double balance=100;
		Customer c=service.createAccount(mobileno,name,accounttype,balance);
		Map<String,Customer>store=service.getDao().getStore();
		store.put(mobileno,c);
		Assert.assertNotNull(c);
		Customer fetched=service.balanceEnquiry(mobileno);
		Assert.assertEquals(c,fetched);
		
		
	}
}
