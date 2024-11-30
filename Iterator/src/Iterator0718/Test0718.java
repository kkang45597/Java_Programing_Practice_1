package Iterator0718;

//import java.util.List;
//import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashSet;
import java.util.Set;



public class Test0718 {
	
	public static void main(String args[]) {

		Set<String> ss = new HashSet<>();
		ss.add("사과");
		ss.add("배");
		ss.add("자두");
		ss.add(null);
		System.out.println(ss);
		
		ss.remove("배");
		System.out.println(ss);
		
		ss.add("배");
		ss.add("배");
		ss.add("포도");
		ss.add(null);
		System.out.println(ss);
		
//		List<String> list = new ArrayList<>(); // 그냥 Collection을 ArrayList로 바꾸는 방법
	}
}
