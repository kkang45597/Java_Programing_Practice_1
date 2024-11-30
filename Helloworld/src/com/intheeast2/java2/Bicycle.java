package com.intheeast2.java2;

public class Bicycle {
	
	private int cadence;
	private int gear;
	private int speed;
        
    // 자전거 클래스는 하나의 생성자를 가집니다.
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
        
    // 자전거 클래스는 네 개의 메서드를 가집니다.
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
