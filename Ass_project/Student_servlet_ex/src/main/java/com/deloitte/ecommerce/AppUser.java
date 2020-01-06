package com.deloitte.ecommerce;

public class AppUser {

    private String mobileno;
	private String password;


	public AppUser() {

    }

    public AppUser(String mobileno, String password) {
        this.mobileno = mobileno;
        this.password = password;
    }

    

    

    
    public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof AppUser)) {
            return false;
        }
        AppUser user = (AppUser) obj;
        return user.mobileno.equals(this.mobileno);
    }

    @Override
    public int hashCode() {
        return mobileno.hashCode();
    }
}
