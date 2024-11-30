package com.intheeast.sb;

public class SuperClassA {
	int state = 1;

    SuperClassA() {
        state = 2; // 생성자에서 state 값을 2로 설정
    }

    void printState() {
        System.out.println("State from SuperClassA: " + state);
    }
}
