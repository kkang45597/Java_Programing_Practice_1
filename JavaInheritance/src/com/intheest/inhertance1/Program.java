package com.intheest.inhertance1;

import com.intheest.inhertance1.MountainBike;

public class Program {

	public static void main(String... strings ) {

		System.out.println("+main");
//		MountainBike bike = new MountainBike();
		Object obj = new MountainBike();
		
//		MountainBike bike = obj; // 컴파일러 오류, 컴파일러는 동일함을 구별하지 못함
//		obj = new Person(); // 참조를 값으로 가지는 변수
		
		// 자바는 메모리 주소를 볼 수 없도록 막아두었기에 참조 주소만 확인할 수 있다. 
//		MountainBike bike = (MountainBike)obj; // 타입 캐스트(변경)는 런 타입 에러를 발생시킨다.
		// obj는 Person의 메소드를 호출하기 위한 참조 변수 값을 가지고 있기 때문에 값을 넣을 수 없다.
		
		MountainBike myBike = null;
		if(obj instanceof MountainBike) {
			myBike = (MountainBike)obj;
		}
		else {
			return;
		}
		
		System.out.println("-main");
	}

}
