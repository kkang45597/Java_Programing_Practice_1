package com.intheest.inhertance1;

//public class Mustang /*extends Horse*/ implements Mammal {
public class Mustang extends Horse implements Mammal {
	public static void main(String... args) {
        Mustang myApp = new Mustang();
        System.out.println(myApp.identifyMyself());
    }
	
	// 오버라이드도 생성할 것으로 친다.
//	@Override
//	public String identifyMyself() {
//		return null;
//	}
}
