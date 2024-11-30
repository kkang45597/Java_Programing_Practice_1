package com.intheeast.sb;

public interface Flyable {
	
	void fly();
	
	default void icanfly() {
		System.out.print("ican fly");
	}
}
