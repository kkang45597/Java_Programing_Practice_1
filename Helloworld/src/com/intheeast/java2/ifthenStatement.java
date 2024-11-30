package com.intheeast.java2;

public class ifthenStatement {
	
	boolean isMoving; //오브젝트 필드
	int currentSpeed; //오브젝트 필드
	
	// 메서드 시그니처: applyBrakes()
	void applyBrakes() {	
	    if (this.isMoving){ 
	        this.currentSpeed--;
	    }
	}
	
	// 메서드는 메서드 시그니처로 구분된다. 파라미터에 따라 컴퍼일러가 구분한다.
	// 메서드 시그니처: applyBrakes(boolean isMoving)
	void applyBrakes(boolean isMoving) {	
	    this.isMoving = isMoving;
	}
	
	void applyBrakes(int currentSpeed) {	
		this.currentSpeed = currentSpeed;
	}
	
	
	public ifthenStatement() { // ifthenStatement 객체(인스터스)
		
	}
	// 메서드는 위쪽 전부
	
	public ifthenStatement(boolean isMoving) {
		this.isMoving = isMoving;
	}
	
	public ifthenStatement(int currentSpeed) {
		this.currentSpeed = currentSpeed;
		
	}
	
	public ifthenStatement(boolean isMoving, int currentSpeed) {
		this(isMoving);
//		this(currentSpeed); // 매개변수가 2개 이상이고, 하나만 가능함
		this.isMoving = isMoving;
		this.currentSpeed = currentSpeed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ifthenStatement ifthenStatement1 = new ifthenStatement(); // 디폴트 생성자
		ifthenStatement ifthenStatement2 = new ifthenStatement();
		ifthenStatement ifthenStatement3 = new ifthenStatement();
		ifthenStatement ifthenStatement4 = new ifthenStatement();
		// 메서드 array에 존재하는 코드이다.
		// 컴파일하지 않아도 에러가 발생하지 않는 이유는? 클래스 파일을 만들때 컴파일러가 생성해준다.

//		ifthenStatement1.applyBrakes();
//		ifthenStatement2.applyBrakes();
//		ifthenStatement3.applyBrakes();
//		ifthenStatement4.applyBrakes();
		
		ifthenStatement1.applyBrakes(10);
		ifthenStatement2.applyBrakes(20);
		ifthenStatement3.applyBrakes(30);
		ifthenStatement4.applyBrakes(40);
		
		System.out.println("Break Point");
	}
}
