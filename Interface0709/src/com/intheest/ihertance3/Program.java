package com.intheest.ihertance3;

public class Program {

	public static void main(String[] args) {
		Processor test1 = input -> System.out.println("Before processing: " + input);
//		Processor test1 = input -> { System.out.println("Before processing: " + input); };
//		Processor test1 = (input) -> { System.out.println("Before processing: " + input); };
		
		test1.process("Goodbye");
		test1.processWithLambda("Hello", (input) -> System.out.println(input.toUpperCase()));
		test1.processWithLambda("Hello", (input) -> System.out.println(input.toLowerCase()));
		
		Processor.test("Hello");
	}
}
