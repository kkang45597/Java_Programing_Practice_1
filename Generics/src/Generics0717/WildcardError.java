package Generics0717;
import java.util.List;

public class WildcardError {
	
	void foo(List<?> i) {
		fooHelper(i);
    }
	
	private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(1)); // 테스트를 위해 0번째 엘리먼트를 1번째 엘리먼트로 set하는 코드로 변경함
    }
}
