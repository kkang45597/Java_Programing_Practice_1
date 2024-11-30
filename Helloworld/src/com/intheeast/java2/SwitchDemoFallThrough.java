package com.intheeast.java2;

public class SwitchDemoFallThrough {

	public static void main(String[] args) {
		
		// String 클래스를 객체로 참조하는 변수이다.
		java.util.ArrayList<String> futureMonths = new java.util.ArrayList<String>();
		int month = 8;
		
		// (데이터 타입) (참조 변수) = new (생성자)(매게변수-파라미터);
//		String str1 = new String("January");
//		String str2 = new String("February");
//		String str3 = new String("February");
		

		switch (month) {
//			case 1:  futureMonths.add(str1);
//			case 2:  futureMonths.add(str2);
//			case 3:  futureMonths.add(str3);
		
			case 1:  futureMonths.add("January"); break;
			case 2:  futureMonths.add("February"); break;
			case 3:  futureMonths.add("March"); break;
			case 4:  futureMonths.add("April"); break;
			case 5:  futureMonths.add("May"); break;
			case 6:  futureMonths.add("June"); break;
			case 7:  futureMonths.add("July"); break;
			case 8:  futureMonths.add("August"); break;
			case 9:  futureMonths.add("September"); break;
			case 10: futureMonths.add("October"); break;
			case 11: futureMonths.add("November"); break;
		
//			case 1:  futureMonths.add("January");
//			case 2:  futureMonths.add("February");
//			case 3:  futureMonths.add("March");
//			case 4:  futureMonths.add("April");
//			case 5:  futureMonths.add("May");
//			case 6:  futureMonths.add("June");
//			case 7:  futureMonths.add("July");
//			case 8:  futureMonths.add("August");
//			case 9:  futureMonths.add("September");
//			case 10: futureMonths.add("October");
//			case 11: futureMonths.add("November");
			case 12: futureMonths.add("December"); break;
			default: break;
		}

		if (futureMonths.isEmpty()) {
			System.out.println("Invalid month number");
    	} 
		else {
    		for (String monthName : futureMonths) {
        		System.out.println(monthName);
    		}
    	}

	}

}
