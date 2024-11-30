package com.intheest.Quiz3;

interface A {
	default void print() {
		System.out.println("A");
	}
}

interface B {
	default void print() {
		System.out.println("B");
	}
}

class C implements A, B {

	@Override
	public void print() {
		A.super.print();
		B.super.print();
		System.out.println("C");	
	}
	
}

public class Main {

	public static void main(String[] args) {
		
		C c = new C();
		c.print();
	}

}
