package com.intheeast.sb;

// 자바는 복수 상속 (Multiple inheritance)를 지원하지 않음
// 단
public class Duck implements Flyable, Swimmable {
	@Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    void quack() {
        System.out.println("Duck is quacking.");
    }
}
