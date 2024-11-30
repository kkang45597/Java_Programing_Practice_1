package com.intheeast2.java2;

public class Animal {
	public Animal getInstance() {
        return new Animal();
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
