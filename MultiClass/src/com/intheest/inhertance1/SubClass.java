package com.intheest.inhertance1;

public class SubClass extends SuperClass1 implements SuperClass2, SuperClass3, SuperClass4 {

	@Override
	public void SuperClass2() {
		System.out.println("슈퍼 클래스 2 (인터페이스)");
	}

	@Override
	public void SuperClass3() {
		System.out.println("슈퍼 클래스 3 (인터페이스)");
	}

	@Override
	public void SuperClass4() {
		System.out.println("슈퍼 클래스 4 (인터페이스)");
	}

	
	public static void main(String[] args) {
		
		SubClass call = new SubClass();
		call.SuperClass1();
		call.SuperClass2();
		call.SuperClass3();
		call.SuperClass4();
		
		Object obj = new SuperClass5();
		((SuperClass5) obj).SuperClass5();
		
	}

	
}
