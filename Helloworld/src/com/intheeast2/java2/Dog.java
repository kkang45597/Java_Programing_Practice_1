package com.intheeast2.java2;

public class Dog extends Animal {
	 @Override
	    public Dog getInstance() {
	        return new Dog();  // 코바리언트 반환 타입 사용
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Woof");
	    }
}
