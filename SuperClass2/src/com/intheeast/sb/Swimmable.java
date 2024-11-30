package com.intheeast.sb;

public interface Swimmable {

	void swim();
	
	default void icanswim() {
		System.out.print("ican swimm");
	}
}
