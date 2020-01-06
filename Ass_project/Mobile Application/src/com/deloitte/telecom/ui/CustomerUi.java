package com.deloitte.telecom.ui;

import java.security.Provider.Service;
import java.util.Scanner;

import com.deloitte.telecom.dao.CustomerDaoImpl;
import com.deloitte.telecom.entities.Customer;
import com.deloitte.telecom.service.CustomerService;
import com.deloitte.telecom.service.CustomerServiceImpl;

public class CustomerUi {
	CustomerService service=new CustomerServiceImpl(new CustomerDaoImpl());
	 
	String mobileno,name,accounttype;
	double balance,amount;
	Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		CustomerUi c=new CustomerUi();
		c.execute();
		
	}
	
	void execute() {
		System.out.println("enter no between 1 to 4");
		
		int option=sc.nextInt();
		
		if(option==1) {
			balanceEnquiry();
		}
		else if(option==2) {
			rechargeAmount();
		}
		else if(option==3) {
			createAccount();
			}
		else if(option==4) {
			
		}
		else
			System.out.println("wrong option");
		
		
	}
void balanceEnquiry() {
	System.out.println("enter mobileno");
	mobileno=sc.next();
	Customer c=service.balanceEnquiry(mobileno);
	System.out.println("balance is: "+c.getBalance());
}
void rechargeAmount() {
	System.out.println("enter mobileno");
	mobileno=sc.next();
	System.out.println("enter amount");
	amount=sc.nextDouble();
	Customer c=service.rechargeAmount(mobileno, amount);
	System.out.println("new balance is: "+c.getBalance());
		
}
void createAccount() {
	System.out.println("enter details");
	System.out.println("mobileno:");
	mobileno=sc.next();
	System.out.println("name:");
	name=sc.next();
	System.out.println("account type:");
	accounttype=sc.next();
	System.out.println("balance:");
	balance=sc.nextDouble();
	Customer c=service.createAccount(mobileno, name, accounttype, balance);
	System.out.println("Account created");
	
	
	
}
}
