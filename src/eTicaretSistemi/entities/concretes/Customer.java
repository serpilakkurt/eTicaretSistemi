package eTicaretSistemi.entities.concretes;

import eTicaretSistemi.entities.abstracts.Entity;

public class Customer implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String ePostaAddress;
	private String password;
	
	
	public Customer(int id, String firstName, String lastName, String ePostaAddress, String password) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ePostaAddress = ePostaAddress;
		this.password = password;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getePostaAddress() {
		return ePostaAddress;
	}
	public void setePostaAddress(String ePostaAddress) {
		this.ePostaAddress = ePostaAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
