package Ass1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import Ass1.Customer;


public class CustomerMain {
	

	public static void main(String[] args) {
		
			Map<String,Customer> m = new HashMap<>();
			Customer c1 = new Customer("9440551322", "chris", 2000);
			Customer c2 = new Customer("9666157496", "pari", 1500);
			Customer c3 = new Customer("8333925219", "cole", 1200);
			Customer c4 = new Customer("8143616684","jain", 1800);
			m.put(c1.getMobileno(),c1);
			m.put(c2.getMobileno(),c2);
			m.put(c3.getMobileno(),c3);
			m.put(c4.getMobileno(),c4);
			c1.transferAmount(c2,500);
			//print();
			CustomerMain n=new CustomerMain();
			n.findBymobileno(m,"9666157496");
			n.print(m);
	
		}
	public void findBymobileno(Map<String,Customer> m,String mobileno) {
		
		Customer c=m.get(mobileno);
		System.out.println("customer name:" +c.getName()+ "customer balance:"+c.getBalance());
	}

	public void print(Map<String,Customer> m) {
		
		Set<String>Keys=m.keySet();
		for (String mobileno : Keys) {
			Customer c =m.get(mobileno);
			System.out.println(c.getName() + c.getBalance());
			
		}
	}
}
		
		
		
		
