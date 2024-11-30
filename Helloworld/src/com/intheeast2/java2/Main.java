package com.intheeast2.java2;

public class Main {
	
//	public static void main(String[] args) {
	public static void main(String... args) {
		
		Main main = new Main();
		main = null;
		// 더 이상 Main Class 객체를 참조하는 참조 변수가 없는 경우
		// 가비지 컬렉션이 수행될 때, 가비지 컬렉션에 의해 Main 클래스 객체는 소멸된다.
		
		int startHeight = 100;
		int startCadence = 10;
		int startSpeed = 10;
		int startGear = 1;
		
		for(String arg : args) {
			System.out.printf(arg);
		}
		
		MountainBike mBike = new MountainBike(startHeight, startCadence, startSpeed, startGear);
		
		EmptyClsss ec = new EmptyClsss();
		
		ACMEBicycle acme = new ACMEBicycle();
		SuperClass sclazz = new SuperClass(1, 2, mBike, acme);
		
		System.out.printf("a: %d", startHeight);
		System.out.printf("a: %d, b: %d", startHeight, startCadence);
		System.out.printf("a: %d, b: %d, c:%d", startHeight, startCadence, startSpeed);
		System.out.printf("a: %d, b: %d, c: %d, d: %d \n", startHeight, startCadence, startSpeed, startGear);
		
		
		////////////////////////////////////////////////////////////////////////////
		Animal myAnimal = new Animal();
		myAnimal.makeSound();  // 출력: Some generic animal sound

		Dog myDog = new Dog();
		myDog.makeSound();  // 출력: Woof

		Animal animalInstance = myAnimal.getInstance();
		animalInstance.makeSound();  // 출력: Some generic animal sound

		Dog dogInstance = myDog.getInstance();
		dogInstance.makeSound();  // 출력: Woof
	}

}
