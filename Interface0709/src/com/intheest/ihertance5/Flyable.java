package com.intheest.ihertance5;

public interface Flyable {
	void fly();
	
	default void defaultFly() {
		System.out.println("Defalut: Duck is flying.");
	}
	
	static void staticFly() {
		System.out.println("Static: Duck is flying.");
	}
}
