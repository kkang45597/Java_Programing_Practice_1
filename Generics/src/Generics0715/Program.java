package Generics0715;

import java.util.ArrayList;
import java.util.List;

class Custom { }

public class Program {

	public static void main(String[] args) {
		
//		List<String> abc = new ArrayList<>(); 
//		Container<String> container = new SimpleContainer<>(abc);
//		
//		container.add("Hello");
//		container.add("World");
//		container.add("WHY");
//		
//		String strObj = container.get(0);
//		System.out.println(strObj);
		
	///////////////////////////////////////////////////////////////
		
		CompareObjects obj1  = new CompareObjects("0201914670");
		CompareObjects obj2  = new CompareObjects("0201914671");
		if (obj1.equals(obj2)) {
		    System.out.println("objects are equal");
		} else {
		    System.out.println("objects are not equal");
		}
	}

}
