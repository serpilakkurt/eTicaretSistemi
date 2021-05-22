package eTicaretSistemi.dataAccess.abstracts;

import java.util.List;

import eTicaretSistemi.entities.concretes.Customer;


public interface CustomerDao {
	boolean dogrulama(Customer customer);
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
    Customer get(int id);
    List<Customer> getAll();
}
