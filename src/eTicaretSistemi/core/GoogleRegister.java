package eTicaretSistemi.core;

import eTicaretSistemi.register.RegisterManager;

public class GoogleRegister implements RegisterService{

	@Override
	public void registerToSystem(String account) {
		
		RegisterManager  registerManager= new RegisterManager();
		registerManager.register(account +" Google");

	}
	
	
}
