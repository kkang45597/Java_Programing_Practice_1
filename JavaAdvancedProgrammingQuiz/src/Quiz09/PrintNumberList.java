package Quiz09;

import java.util.List;

public class PrintNumberList {

	public void printNumberList(List<? extends Number> list) {	
		for(Number element : list) {
			System.out.println(element);
		}
	}
	
	//
}
