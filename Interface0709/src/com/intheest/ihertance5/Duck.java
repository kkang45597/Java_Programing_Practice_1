package com.intheest.ihertance5;

public class Duck implements Flyable, Swimmable {

	@Override
	public void swim() {
		System.out.println("Duck is flying.");
	}

	@Override
	public void fly() {
		System.out.println("Duck is swimming.");
		
	}
	
	void quack() {
		System.out.println("Duck is quacking.");
	}
}