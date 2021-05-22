package eTicaretSistemi.dataAccess.concretes;

import java.util.List;

import eTicaretSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretSistemi.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao {
	
	@Override
	public 	boolean dogrulama(Customer customer) {
		add(customer);
		return true;
		
	}

	@Override
	public void add(Customer customer) {
		
			System.out.println("Müsteri veri tabanýna eklendi");
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
