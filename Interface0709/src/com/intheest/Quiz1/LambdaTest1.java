package com.intheest.Quiz1;

public class LambdaTest1 {

	public static void main(String[] args) {
		
		MyFunction func = (int x, int y) -> x + y; 
		// 답: (int x, int y) -> x + y
		
		System.out.println(func.apply(2, 3));
	}
}
