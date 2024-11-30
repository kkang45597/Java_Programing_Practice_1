package com.intheest.ihertance3;

@FunctionalInterface
public interface Processor  {
	
	void process(String input);

	default void processWithLambda(String input, Processor processor) {
		System.out.println("Before processing: " + input);
		processor.process(input);
		System.out.println("After processing: " + input);
	}
	
	static void test(String input) {
		System.out.println("Test processing: " + input);
	}
}