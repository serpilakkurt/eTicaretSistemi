package eTicaretSistemi.business.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretSistemi.business.abstracts.CustomerService;
import eTicaretSistemi.core.RegisterService;
import eTicaretSistemi.dataAccess.abstracts.CustomerDao;
import eTicaretSistemi.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	
	ArrayList<String> eMails= new ArrayList<>();
	ArrayList<Customer> customers=new ArrayList<Customer>();
	
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	private CustomerDao customerDao;
	private RegisterService registerService;
	
	
	public CustomerManager(CustomerDao customerDao, RegisterService registerService) {
		this.customerDao = customerDao;
		this.registerService = registerService;
	}

	

	@Override
	public void register(Customer customer)
	{
		Matcher matcher = pattern.matcher(customer.getePostaAddress());
		
		if(nameControl(customer)) 
		{
			if(matcher.matches( ))
			{
				if(ePostaKontrol(customer))
				{
					if(customer.getPassword().length()>=6)
					{
						registerService.registerToSystem(customer.getFirstName());
                        sendEmail(customer, "www");
						eMails.add(customer.getePostaAddress());
						
					}else {
						System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
					      }
					
				}else {
				      System.out.println("Bu e-posta kullanýlýyor.");
				      }
				
			 }else {
				 System.out.println("Geçersiz e posta.");
			       }
		}else {
			System.out.println("Ýsim veya soyisim geçersiz.");
		      }
		
	}

	@Override
	public ArrayList<Customer> getAll(Customer customer) {
		return customers;
	}
	
	public boolean ePostaKontrol(Customer customer) {
		int tut=0;
		for (String email : eMails) {
			if(email==customer.getePostaAddress()) {
				tut++;
			}
		}
		
		if(tut>0) {
			return false;
		}
		return true;
	}
	
	public boolean nameControl(Customer customer) {
		if((customer.getFirstName().length()>=2) &&( customer.getLastName().length()>=2)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void sendEmail(Customer customer,String link) {
		System.out.println(customer.getePostaAddress() + " adresine "+ link+" doðrulama linki gönderildi.");
		this.customerDao.dogrulama(customer);
	}
	
	
	
	
}
