package com.intheeast2.java2;

public class MountainBike extends Bicycle {
    
    // MountainBike 하위 클래스는 하나의 필드를 가집니다.
    public int seatHeight;

    // MountainBike 하위 클래스는 하나의 생성자를 가집니다.
    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   
        
    // MountainBike 하위 클래스는 하나의 메서드를 가집니다.
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }   
}
