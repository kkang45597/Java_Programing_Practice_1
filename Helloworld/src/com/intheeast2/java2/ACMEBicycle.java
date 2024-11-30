package com.intheeast2.java2;

class ACMEBicycle {
	
	int cadence = 0;
	int speed = 0;
	int gear = 1;
	
//	private com.intheeast2.java2.Bicycle Bicycle;

	public void changeCadence(int newValue) {
		cadence = newValue;
	}
	public void changeGear(int newValue) {
		gear = newValue;
	}
	public void speedUp(int increment) {
		speed = speed + increment;   
	}
	public void applyBrakes(int decrement) {
		speed = speed - decrement;
	}
	void printStates() {
		System.out.println("cadence:" + cadence + " speed:" +  speed + " gear:" + gear);
	}
}
