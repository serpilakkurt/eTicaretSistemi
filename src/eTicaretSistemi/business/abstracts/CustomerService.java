package eTicaretSistemi.business.abstracts;

import java.util.ArrayList;

import eTicaretSistemi.entities.concretes.Customer;

public interface CustomerService {
  
	void register(Customer customer);
	ArrayList<Customer> getAll(Customer customer);
}
