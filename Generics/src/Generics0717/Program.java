package Generics0717;

import java.util.Arrays;
import java.util.List;

public class Program {

//	public static void printList(List<?> list) {
//	    for (Object elem : list)
//	        System.out.println(elem + " ");
//	    System.out.println();
//	}
	
//	public static void printList1(List<T extends Object> list) { // 제너릭 타입은 메서드 파라미터로 사용할 수 없다.
	public static <T extends Object> void printList1(List<T> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}	
	
	public static void printList(List<? extends Object> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}	
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<Double> ld = Arrays.asList(1.0, 2.2, 3.4);
		List<String>  ls = Arrays.asList("one", "two", "three");
		Program.printList(li);
		Program.printList(ld);
		Program.printList(ls);
	}
}
