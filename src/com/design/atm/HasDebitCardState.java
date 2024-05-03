package com.design.atm;

public class HasDebitCardState implements AtmMachineState {

	

	@Override
	public void insertCard() {
		System.out.println("Debit Card is already there,So you cannot insert the Debit Card ...");
		
	}

	@Override
	public void ejectCard() {
		System.out.println("Debit card is ejected");
	}

	@Override
	public void withdrawMoney(int pin, int amount) {
		
		validatePin(pin);
		validateAmount(amount);
		System.out.println("The amount " +amount  + " has been withdrawn");
		
	}
	
	public void validatePin(int pin) {
		if(pin<1000 || pin>9999) {
			System.out.println("pin number should be 4 digits");  // u can throw exception as well 
			System.exit(1);
			
		}
			System.out.println("pin numer is correct");
			
		
	}
	
	public void validateAmount(int amount) {
		
		if (amount < 0) {
	        throw new IllegalArgumentException("Please enter amount in positive numbers");
	    }
	    if (amount % 20 != 0) {
	        throw new IllegalArgumentException("Please enter amount in multiples of 20");
	    }
		System.out.println("amount entered succesfully");
	}

}
