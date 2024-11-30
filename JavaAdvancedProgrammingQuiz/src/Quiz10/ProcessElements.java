package Quiz10;

import java.util.List;

interface Processor<T> {
	void process();
}

public class ProcessElements {
	
	public <T> void processElements(List<T> list, Processor<T> t) {
		
		for(T element : list) {
			
		}
	}
	
	//
}
