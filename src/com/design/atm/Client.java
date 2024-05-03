package com.design.atm;

public class Client {
	
	public static void main(String[] args) {
		
		
		AtmMachine atm = new AtmMachine();
		
		System.out.println("Transaction has been initialized");
		
		System.out.println("#################");
			
		atm.insertCard();
		
		atm.withdrawMoney(2358, 500);
		
		atm.ejectCard();
		
		System.out.println("#################");
		
		System.out.println("Transaction has been completed");
				
		
		

			
		
		
	}

}
