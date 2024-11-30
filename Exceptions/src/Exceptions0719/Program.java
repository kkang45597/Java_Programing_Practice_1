package Exceptions0719;

import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		for(String a : args) {
			Integer value = m.get(a); // 임의의 키 값을 만들기 위한 사전 작업
			m.put(a, (value == null) ? 1 : value + 1);
		}
		
		System.out.println(m.size() + " distinct words: ");
		System.out.println(m);
	}

}
