package com.intheest.ihertance5;

public interface Swimmable {
	void swim();
	
	default void defaultSwim() {
		System.out.println("Defalut: Duck is swimming.");
	}
	
	static void staticSwim() {
		System.out.println("Static: Duck is swimming.");
	}
}
