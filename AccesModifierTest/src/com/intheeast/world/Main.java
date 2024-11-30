package com.intheeast.world;

import com.intheeast.KMG.TopLevelPackage; // 다른 패키지에서 가져오겠다는 뜻

public class Main {

	public static void main(String[] args) {
		
		// 컴파일 에러가 발생함, TopLevelPacke cannot be resolved to a type
		// TopLevelPacke이 어딧는지 못찾겠다는 뜻, 패키지가 달라서 그렇다.
		// import 로 해결이 가능하다.
		TopLevelPackage tpk = new TopLevelPackage();
//		tpk.helloWorld(); // Protected 로 선언되어서 안된다.
		
		TopLevelPackageSubClass tlpkSub = new TopLevelPackageSubClass();
//		tlpkSub.helloWorld(); // 상속받은 클래스는 서브 클래스에 있어야 호출이 가능하다.
		tlpkSub.accessHelloWorld();
	}
}
