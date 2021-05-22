package eTicaretSistemi;

import eTicaretSistemi.business.concretes.CustomerManager;
import eTicaretSistemi.core.GoogleRegister;
import eTicaretSistemi.dataAccess.concretes.HibernateCustomerDao;
import eTicaretSistemi.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
    
		Customer customer=new Customer(1,"Serpil","Akkurt","abc@gmail.com","123456");
		Customer customer2=new Customer(1,"Serpil","Akkurt","abc@gmail.com","123456");
		
		CustomerManager customerManager= new CustomerManager(new HibernateCustomerDao(), new GoogleRegister());
		customerManager.register(customer);
		customerManager.register(customer2);
		
	}

}
