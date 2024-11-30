package com.intheest.inhertance1;

public class SubClass extends SuperClass {

	void SuperClassCall() {
		protectedSuperClass();
	}
	
	public static void main(String[] args) {
		SubClass call = new SubClass();
		
		call.SuperClassCall(); // SubClass 내부에서 protectedSuperClass 메서드를 호출
		call.protectedSuperClass(); // SubClass 외부에서 메서드를 직접 호출
	}
}
