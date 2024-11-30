package Generics0717;

import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
	public static void main(String[] args) {
//        List<?> wildcardList = new ArrayList<Integer>();
//
        // null 삽입은 허용됩니다.
//        wildcardList.add(null);
//        wildcardList.add(null);
		
		// 다른 객체 삽입 시도 (컴파일 오류 발생)
        // wildcardList.add("Hello");  // 컴파일 오류
        // wildcardList.add(123);      // 컴파일 오류
		
		List<Object> wildcardList = new ArrayList<>(); 
		wildcardList.add(1);
		wildcardList.add("123");
		wildcardList.add("Apple");
        
        System.out.println("List contains: " + wildcardList);
    }
}
