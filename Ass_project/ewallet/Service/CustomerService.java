package Service;
import java.util.Set;

import entities.Customer;

public interface CustomerService {
	void addCustomer(Customer c);
	Customer findCustomerByMobileno(String mobileno);
	Set<Customer> allCustomers();
	void addCustomer(Ass1.Customer c);

}
