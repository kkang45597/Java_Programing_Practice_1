package interface240705;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		
//		OperateBMW760i obmw = new OperateBMW760i();
//		int ret = obmw.turn(Direction.LEFT, 0, 0, 0);
		
//		OperateCar oc = new OperateBMW760i();
//		int ret = oc.turn(Direction.LEFT, 0, 0, 0);
//		
//		System.out.println(ret);
		
		Point pi = new Point(40, 40);
		Point pi2 = new Point(40, 40);
		Relatable rectangle = new RectanglePlus(pi, 40, 40);
		Relatable rectangle2 = new RectanglePlus(pi2, 50, 50);
		
		int ret1 = rectangle.isLargerThan(rectangle2);
		int ret2 = rectangle2.isLargerThan(rectangle);
		
		Relatable relatable1 = new RectanglePlus(pi, 40, 40);
		Relatable relatable2 = new RectanglePlus(pi2, 50, 50);

		Object ret3 = Relatable.findLargest(relatable1, relatable2);
		Object ret4 = Relatable.findSmallest(relatable1, relatable2);
		Object ret5 = Relatable.isEqual(relatable1, relatable2);
		Object ret6 = Relatable.isEqual(relatable1, relatable1);
		
		Relatable circle1 = new RectanglePlus(pi, 40, 40);
		Relatable circle2 = new RectanglePlus(pi2, 50, 50);
		
		int ret7 = circle1.isLargerThan(circle2);
		int ret8 = circle2.isLargerThan(circle1);
		Object ret9 = Relatable.findLargest(circle1, circle2);
		Object ret10 = Relatable.findSmallest(circle1, circle2);
		Object ret11 = Relatable.isEqual(circle1, circle2);
		Object ret12 = Relatable.isEqual(circle1, circle1);
		
		System.out.println("isLargerThan : " + ret1);
		System.out.println("isLargerThan : " + ret2);
		System.out.println("findLargest : " + ret3);
		System.out.println("findSmallest : " + ret4);
		System.out.println("isEqual : " + ret5);
		System.out.println("isEqual : " + ret6);
		System.out.println("=======================");
		System.out.println("isLargerThan : " + ret7);
		System.out.println("isLargerThan : " + ret8);
		System.out.println("findLargest : " + ret9);
		System.out.println("findSmallest : " + ret10);
		System.out.println("isEqual : " + ret11);
		System.out.println("isEqual : " + ret12);
		
//		Relatable circle = new CirclePlus();		
		// 아래 코드는 런타임 에러를 유발시킨다. 
		// CirclePlus cannot be cast to class RectanglePlus
//		rectangle.isLargerThan(circle);
	}

}
