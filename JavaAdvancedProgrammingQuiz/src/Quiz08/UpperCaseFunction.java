package Quiz08;

interface Function <T> {
	T apply(T t);
}

public class UpperCaseFunction implements Function<String> {

	@Override
	public String apply(String str) {
		return str.toString().toUpperCase();
	}
	
	// 흠

}
