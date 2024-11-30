package Quiz03;

import java.util.List;

public class CountGreaterThan {
	
	public <T extends Comparable <T>> int countGreaterThan(List<T> list, T t) {
		int count = 0;
		for(T element : list) {
			if(element.compareTo(t) > 0) {
				count++;
			}
		}
		return count;
	}
	
	//
}

