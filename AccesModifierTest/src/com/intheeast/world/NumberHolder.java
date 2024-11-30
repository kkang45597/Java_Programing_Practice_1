package com.intheeast.world;

public class NumberHolder {

	public int anInt;
	public float aFloat;
	
	private void NumberReset() {
		anInt = 1;
		aFloat = 2.661f;
		System.out.printf("anInt is %d \n", anInt);
		System.out.printf("aFloat is %f", aFloat);
	}
	
	public static void main(String[] args) {
		NumberHolder number = new NumberHolder();
		number.NumberReset();
	}
}
