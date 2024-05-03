package com.design.atm;

public interface AtmMachineState {
	
	
	
	public void insertCard();
	
	public void ejectCard();
	
	public void withdrawMoney(int pin, int amount);
	

}
