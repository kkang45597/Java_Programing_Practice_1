package com.intheest.Quiz1;

import java.util.function.BiFunction;

public class LambdaTest5 {

	public static void main(String[] args) {
	
		BiFunction<String, String, String> concat = (String x, String y) -> x + y;
		// 답: (String x, String y) -> x + y
		
		System.out.println(concat.apply("Hello ", "Lambda"));

	}

}
