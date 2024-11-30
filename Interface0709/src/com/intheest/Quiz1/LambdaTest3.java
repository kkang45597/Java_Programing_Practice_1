package com.intheest.Quiz1;

public class LambdaTest3 {

	public static void main(String[] args) {
		
		StringLength length = s -> s.length(); 
		// 답: (String s) -> s.length()
		
		System.out.println(length.getLength("Lambda"));
	}

}
