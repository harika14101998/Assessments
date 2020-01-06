package entities;

public class Customer {
	private String mobileno;
	private String name;
	private double balance;
	
	public Customer(String mobileno, String name, double balance) {
		this.mobileno = mobileno;
		this.name = name;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void transferAmount(Customer a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;

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
        return c.mobileno==this.mobileno;
    }

    @Override
    public int hashCode() {
        return mobileno.hashCode();
    }
}

