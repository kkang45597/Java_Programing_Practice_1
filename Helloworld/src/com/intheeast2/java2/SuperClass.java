package com.intheeast2.java2;

public class SuperClass {
	
	int x;
	int y; 
	
	MountainBike mBike;
	ACMEBicycle acmeBike;
	
	public SuperClass() { }
	
	// 컴파일러가 디폴트 생성자를 자동으로 만들지 않는
	public SuperClass(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public SuperClass(int x, int y, MountainBike mBike, ACMEBicycle acmeBike) {
		this(x, y);
		this.mBike = mBike;
		this.acmeBike = acmeBike;
	}
	
	public void setMountainSeatHeight() {
		
	}

}
