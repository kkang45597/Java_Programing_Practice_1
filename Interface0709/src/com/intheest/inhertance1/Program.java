package com.intheest.inhertance1;

public class Program {

	public static void main(String[] args) {
		
		Relatable rect1 = new RectanglePlus(50,100);
		Relatable rect2 = new RectanglePlus(50,50);
	
		Relatable test1 = (Relatable)RectanglePlus.findLargest(rect1, rect2);
		Relatable test2 = (Relatable)RectanglePlus.findSmallest(rect1, rect2);
		boolean test3 = RectanglePlus.isEqual(rect1, rect2);
		
//		RectanglePlus rect3 = new RectanglePlus(50,100);
//		rect3.findLargest(rect1, rect2); // 권장하지 않음
		
//		Object rect3 = new RectanglePlus(50,100);
//		Object rect4 = new RectanglePlus(50,50);
//		
//		Object test4 = (Relatable)RectanglePlus.findLargest(rect3, rect4);
//		Object test5 = (Relatable)RectanglePlus.findSmallest(rect3, rect4);
//		boolean test6 = RectanglePlus.isEqual(rect3, rect4);
	}
}
