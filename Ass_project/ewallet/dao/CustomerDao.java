package dao;
import java.util.Set;

import entities.Customer;
public interface CustomerDao {

		void addCustomer(Customer c);
		Customer findCustomerByMobileno(String mobileno);
		Set<Customer> allCustomers();
}
