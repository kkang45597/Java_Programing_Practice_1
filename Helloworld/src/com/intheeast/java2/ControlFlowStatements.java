package com.intheeast.java2;

public class ControlFlowStatements {
	
//	1. if
//	2. switch
//	3. do while / while
//	4. for( ; ; ; ) { }
//	5. while(true) { }
	
//	a. second string
//	b. if(aNumber >= 0) >> if(aNumber == 0) >> System.out.println(third String);

	public static void main(String[] args) {
		
		int aNumber = 3;
		
		if (aNumber >= 0) {
		    if (aNumber == 0) {
		        System.out.println("first string");
		    }
		}
		else {
			System.out.println("second string");
		}
		System.out.println("third string");
	}

}
