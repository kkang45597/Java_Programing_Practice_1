package com.intheeast.world;

public class Bicycle {

	private int cadence;
    private int gear;
    private int speed;
    private int id;
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear){
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles; // Bicycle 수를 증가시키고 ID 번호를 할당
    }

    public int getID() {  // ID 인스턴스 변수를 반환하는 새로운 메서드 추가
        return id;
    }
    
    public void setNumberOfBicylcle(int number) {
    	this.getNumberOfBicycles(); // 불특정 다수로 부터 공유될 목적이라 가능
    	getNumberOfBicycles(); //
    	numberOfBicycles = number;
    }
    
    public static int getNumberOfBicycles() {
//    	this.setNumberOfBicylcle(3); // static 메서드는 this를 사용한 호출을 할수 없다.
//    	int whatGera = gear;
    	return numberOfBicycles;
    }
    
    public static void setXNumberOfBicycle(int num) {
    	int curNumber = getNumberOfBicycles();
    	numberOfBicycles = num;
    }
   
    
    
	public static void main(String[] args) {
		
//		Bicycle bicycle = new Bicycle(1, 2, 3);
//		bicycle.setNumberOfBicylcle(numberOfBicycles);
		
		int num = Bicycle.getNumberOfBicycles();
		}

}
