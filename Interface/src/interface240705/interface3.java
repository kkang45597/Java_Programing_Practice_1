package interface240705;

public interface interface3 {

	// abstarct 로 작성
	abstract void A3(String str, int x); // 추상화라 바디가 없다.
			
	// default(public)이다.
	default void B3(int x, int y) {
		System.out.printf("인터페이스2 디폴트, x= %d, y= %d \n", x, y);
	}
}
