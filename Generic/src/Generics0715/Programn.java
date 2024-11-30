package Generics0715;

public class Programn {

	public static void main(String[] args) {

		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
		
		String p1Key = p1.getKey();
		Integer p1Value = p1.getValue();
		System.out.println(p1Key + ", " + p1Value);
		
		String p2Key = p2.getKey();
		String p2Value = p2.getValue();
		System.out.println(p2Key + ", " + p2Value);
		
		Box<Integer> box = new Box<Integer>();
		box.set(100);
		Integer integerBox = box.get();
		System.out.println(integerBox);
		
		Pair<String, Box<Integer>> p3 = new OrderedPair<>("primes", new Box<Integer>());
		String p3Key = p3.getKey();
		Box<Integer> p3Value = p3.getValue();
		p3Value.set(150);
		Integer callp3Value = p3Value.get();
		System.out.println(p3Key + ", " + callp3Value);
	}

}
