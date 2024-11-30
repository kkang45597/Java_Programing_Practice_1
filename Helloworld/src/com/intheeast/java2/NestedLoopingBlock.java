package com.intheeast.java2;

public class NestedLoopingBlock {

	public static void main(String[] args) {
		
		for(int i=0; i < 5; i++) {
			
			// 중첩된 for 구문도 enclose 구문의 명령문(statement)이다.
			for(int j=0; j < 5; j++) {
				System.out.println("i : " + i + ", j : " + j);
			}
		}
	}
}
