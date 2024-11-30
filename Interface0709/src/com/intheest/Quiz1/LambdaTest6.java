package com.intheest.Quiz1;

public class LambdaTest6 {
	public static void main(String[] args) {

		StringFormatter formatter = (input) -> {
			return input.toUpperCase(); 
		};
		// 답: (input) -> input.toUpperCase()
		
		System.out.println(formatter.format("Hello Lambda"));
	}
}
