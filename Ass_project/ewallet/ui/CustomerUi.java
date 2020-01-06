package ui;

import java.util.Collection;
import java.util.Set;

import dao.CustomerDaoImpl;
import entities.Customer;
import Service.CustomerServiceImpl;
import Service.CustomerService;

public class CustomerUi {
	private CustomerService service = new CustomerServiceImpl(new CustomerDaoImpl());

    public static void main(String[] args) {
        CustomerUi ui = new CustomerUi();
        ui.runUi();
    }

    public void runUi() {
        try {
            Customer c1 = new Customer("1234", "chandra", 2000);
            Customer c2 = new Customer("2345", "satya",3000);
            service.addCustomer(c1);
            service.addCustomer(c2);
            Customer fetched1 = service.findCustomerByMobileno("1234");
            Customer fetched2 = service.findCustomerByMobileno("2345");
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            System.out.println("********printing all employees****");
            Set<Customer> customer = service.allCustomers();
            print(customer);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Customer>customer){
        for (Customer c:customer){
            System.out.println(c.getName());
        }
    }
}
