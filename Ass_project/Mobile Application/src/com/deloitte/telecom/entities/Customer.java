package com.deloitte.telecom.entities;

public class Customer {
	private String mobileno;
	private String name;
	private String accounttype;
	private double balance;
	
	
	public Customer(String mobileno, String name, String accounttype,double balance) {
		this.mobileno = mobileno;
		this.name = name;
		this.setAccounttype(accounttype);
		this.balance = balance;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
    public String toString() {
        String display=mobileno+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
        
    	if(obj==this){
            return true;
        }
        
        if(obj ==null|| !(obj instanceof Customer)){
            return false;
        }
        Customer c= (Customer)obj;
        return c.mobileno.equals(this.mobileno);
    }
    @Override
    public int hashCode() {
        return mobileno.hashCode();
    }

	
}
