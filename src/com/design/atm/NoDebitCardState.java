package com.design.atm;

public class NoDebitCardState implements AtmMachineState {


	@Override
	public void insertCard() {
		System.out.println("please insert a debit card");
	}

	@Override
	public void ejectCard() {
		System.out.println("No Debit Card in ATM Machine, so you cannot eject the Debit Card...");
		
	}

	@Override
	public void withdrawMoney(int pin, int amount) {
		 System.out.println("No Debit Card in ATM Machine, so you cannot enter the pin and withdraw the money...");
	}

}
