package com.intheest.inhertance1;

public class MountainBike extends Bicycle {
	
    public MountainBike() {
    	System.out.println("산악 자전거 기본 생성자");
    }
    
    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }   

	// the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}
