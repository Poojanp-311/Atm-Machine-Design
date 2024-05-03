package com.design.atm;

public class AtmMachine {
	
	private AtmMachineState atmMachineState;
	
	
	public AtmMachine() {
		atmMachineState = new NoDebitCardState();
	}


	public AtmMachineState getAtmMachineState() {
		return atmMachineState;
	}


	public void setAtmMachineState(AtmMachineState atmMachineState) {
		this.atmMachineState = atmMachineState;
	}
	
	
	public void insertCard() {
		atmMachineState.insertCard();
		
		// machine did not had a card hence we are inseritng it
		if(atmMachineState instanceof NoDebitCardState) {
			AtmMachineState	hasDebitCardState = new HasDebitCardState();
			setAtmMachineState(hasDebitCardState);
			System.out.println("Atm state has been moved to " + atmMachineState.getClass().getName());
		}		
		
	}
	
     public void ejectCard() {
    	 atmMachineState.ejectCard();
    	 
    	 // machine has a card and we are ejecting it
    	 if(atmMachineState instanceof HasDebitCardState) {
 			AtmMachineState	noDebitCardState = new NoDebitCardState();
 			setAtmMachineState(noDebitCardState);
 			System.out.println("Atm state has been moved to " + atmMachineState.getClass().getName());
 		}
    	 
     }
	
	 public void withdrawMoney(int pin, int amount) {
		 
		 atmMachineState.withdrawMoney(pin, amount);
		 
	 }
	
	
	
	
	
	
	
	
	
	

}
