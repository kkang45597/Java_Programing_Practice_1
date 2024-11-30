package com.intheeast.sb;

public class SubClass extends SuperClassA {
	
	@Override
	void printState() {
	// 만약 다중 상속이 가능하다면, 어떤 state를 출력해야 할지 애매해집니다.
	super.printState(); // SuperClassA의 state 출력
	// SuperClassB의 state도 출력해야 한다면?
		// super.printState(); // SuperClassB의 state 출력 (애매해짐)
	}
}
