package com.intheeast.KMG;

// 디폴트로 Package-private가 설정되었다.
public class TopLevelPackage {

	// 필드는 멤버 레벨에 속한다.
	int a;
	int b;
	// 디폴트 생성자는 컴파일러에 의해 생성된다.
	
	private int x;
	private int y;
	
	protected void helloWorld() {
		
	}
	
	// 패키지 프라이빗
	void helloWorld(String str) {
		System.out.printf("hellow World, %s", str);
	}
}
