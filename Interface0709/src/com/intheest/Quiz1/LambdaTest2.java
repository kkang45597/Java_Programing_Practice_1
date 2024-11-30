package com.intheest.Quiz1;

public class LambdaTest2 {
	
	//int value = 5;
	public Runnable LambdaRun() {
		int value = 5;

		Runnable r = () -> {
//			value = 10;
			System.out.println("Value: " + value);
		};
		return r;
	}
	
	public static void main(String[] args) {	
		LambdaTest2 lambda2 = new LambdaTest2();
		Runnable r = lambda2.LambdaRun();
		r.run();//
	}
}
