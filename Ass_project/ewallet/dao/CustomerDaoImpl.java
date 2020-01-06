package dao;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import entities.Customer;
import exceptions.CustomerNotFoundException;



public class CustomerDaoImpl implements CustomerDao{
	private Map<String,Customer> store = new HashMap<>();


    @Override
    public void addCustomer(Customer c) {
 
       store.put(c.getMobileno(), c);
   
 }

    @Override
   public Customer findCustomerByMobileno(String mobileno) {
   
     Customer c = store.get(mobileno);
     
   if (c == null) {
            
throw new CustomerNotFoundException("Customer not found for Mobileno=" + mobileno);
   
     }
      
  return c;
  
  }

    @Override
  
  public Set<Customer> allCustomers() {
     
   Collection<Customer> customer = store.values();
  
      Set<Customer> CustomerSet = new HashSet<>(customer);
   
     return CustomerSet;
   
 }

}
