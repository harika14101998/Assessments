package Service;

import entities.Customer;
import exceptions.IncorrectMobilenoException;

import java.util.Set;

import dao.CustomerDao;
import dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService{
	private CustomerDao dao;
	public CustomerServiceImpl(CustomerDaoImpl customerDaoImpl) {
        this.dao = customerDaoImpl;
	}
	@Override
	public void addCustomer(Customer c) {
		dao.addCustomer(c);
	}
	@Override
	public Customer findCustomerByMobileno(String mobileno) {
        if (mobileno == null) {
            throw new IncorrectMobilenoException("id is incorrect");
        }
        Customer c = dao.findCustomerByMobileno(mobileno);
        return c;
	}
	 @Override
	    public Set<Customer> allCustomers() {
	        Set<Customer> customer = dao.allCustomers();
	        return customer;
	 }
	@Override
	public void addCustomer(Ass1.Customer c) {
		// TODO Auto-generated method stub
		
	}

}