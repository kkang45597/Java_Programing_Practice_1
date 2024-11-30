package com.intheest.Quiz1;

public class LambdaTest4 {

	public static void main(String[] args) {
		
//		Runnable r = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Running");
//			}
//		};
		
		Runnable r = () -> System.out.println("Running"); // 이건 아닌듯
		r.run();
	}

}
