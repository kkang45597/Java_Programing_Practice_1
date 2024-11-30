package com.intheeast.sb;

public class SuperClassB {
	int state = 3;

    SuperClassB() {
        state = 4; // 생성자에서 state 값을 4로 설정
    }

    void printState() {
        System.out.println("State from SuperClassB: " + state);
    }
}
