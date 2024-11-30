package com.intheest.Quiz2;

import com.intheest.Quiz2.Vehicle.NestedVehicle;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car();	
		myCar.start();
		
		NestedVehicle nestedMyCar = myCar.new NestedVehicle();
		nestedMyCar.NestedStart();
	}

}
