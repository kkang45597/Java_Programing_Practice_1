package com.intheest.Quiz2;

public class Vehicle {
	private void start() {
		System.out.println("Vehicle started");
	}
	
	class NestedVehicle {
		public void NestedStart() {
			start();
		}
	}
}
