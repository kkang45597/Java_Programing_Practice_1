package com.intheeast.sb;

public class MultipleInheritanceDemo {
	public static void main(String[] args) {
        // Duck 객체를 생성합니다.
        Duck duck = new Duck();

        // Flyable 타입 변수에 Duck 객체를 할당합니다.
        Flyable flyable = duck;
        flyable.fly();
        // flyable.swim(); // 컴파일 오류: Flyable 타입에서는 swim() 메서드에 접근할 수 없습니다.

        // Swimmable 타입 변수에 Duck 객체를 할당합니다.
        Swimmable swimmable = duck;
        swimmable.swim();
        // swimmable.fly(); // 컴파일 오류: Swimmable 타입에서는 fly() 메서드에 접근할 수 없습니다.

        // Duck 타입 변수에 Duck 객체를 할당합니다.
        Duck sameDuck = (Duck) flyable;
        sameDuck.fly();
        sameDuck.swim();
        sameDuck.quack();
    }
}
