package Quiz02;

import java.util.List;

public class printSumOfList {
	
	public static <T extends Number & Comparable<T>> void printSumOfList(List<T> list) {
		int sum = 0;
		for(T element : list) {
			sum += element.intValue();
		}
		System.out.println("Sum: " + sum);
	}

	// Comparable 인터페이스는 자바에서 제공하는 디폴트 인터페이스이다.
}
