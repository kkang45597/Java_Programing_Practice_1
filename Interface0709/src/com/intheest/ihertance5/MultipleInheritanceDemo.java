package com.intheest.ihertance5;

public class MultipleInheritanceDemo extends Duck {

	public static void main(String[] args) {
		
		Duck duck = new Duck();
		
		Flyable flyable = duck; // Flyable 타입 변수에 Duck 객체를 할당
		flyable.fly();
		flyable.defaultFly();
		Flyable.staticFly();
		
		Swimmable swimmable = duck;
		swimmable.swim();
		swimmable.defaultSwim();
		Swimmable.staticSwim();
		
		Duck sameDuck = new Duck();
		sameDuck.fly();
		sameDuck.swim();
		sameDuck.quack();
	}

}
