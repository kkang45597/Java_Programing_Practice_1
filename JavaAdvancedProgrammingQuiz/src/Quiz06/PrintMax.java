package Quiz06;

import java.util.List;

public class PrintMax {

	public <T extends Comparable <T>> T printMax(List<T> list) {
		
		T biggestNumber = list.get(0);
		
		for(T element : list) {
			if(element.compareTo(biggestNumber) > 0) {
				biggestNumber = element;
			}
		}
		
		return biggestNumber;
	}
	
	//compareTo 는 값이 같으면 0을, 작으면 -1을, 크면 1을 반환한다. 그래서 > 0을 사용하는 것이다.
}
