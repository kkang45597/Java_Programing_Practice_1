package com.intheest.ihertance4;

public class SampleCodeRule {

	int number = 1; // 클래스 필드는 특정 값으로 설정된다.
	String name = null;
	
	{
		if (number == 1) {
			name = "Hello";
		}
	}
	
	
	
	public SampleCodeRule(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args) {
		

	}

}
